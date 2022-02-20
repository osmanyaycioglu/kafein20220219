package com.java.training.oo.person;

import java.util.List;
import java.util.Scanner;

import com.java.training.oo.intf.IHello;
import com.java.training.oo.person.commands.AtmCommandsFactory;
import com.java.training.oo.person.commands.IAtmCommand;

public class PersonApplication {

    private static final int       TL_HESABI_GOR    = 1;
    private static final int       USD_HESABI_GOR   = 3;
    private final PersonDataReader personDataReader = new PersonDataReader();
    private final PersonManager    personManager    = new PersonManager();

    public void start() {
        List<Person> readPersonsLoc = this.personDataReader.readPersons("person.txt");
        this.personManager.refresh(readPersonsLoc);
    }

    public Person login(final Scanner sc) {
        try {
            System.out.println("username : ");
            String usernameLoc = sc.nextLine();
            System.out.println("password : ");
            String passwordLoc = sc.nextLine();
            Person personLoc = this.personManager.login(usernameLoc,
                                                        passwordLoc);
            if (personLoc != null) {
                IHello helloLoc = PersonHelloFactory.getHello(personLoc.getPersonProperties()
                                                                       .getLanguage());
                String helloStrLoc = helloLoc.hello(personLoc.getName(),
                                                    personLoc.getSurname());
                System.out.println(helloStrLoc);

            }
            return personLoc;
        } catch (PersonAppException eLoc) {
            System.out.println("Application problemi : " + eLoc.getMessage());
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
        return null;
    }

    public void menu(final Scanner scParam,
                     final Person personParam) {
        List<IAtmCommand> commandsLoc = AtmCommandsFactory.getCommands(personParam);
        while (true) {
            int index = 1;
            for (IAtmCommand iAtmCommandLoc : commandsLoc) {
                System.out.println(index + "-" + iAtmCommandLoc.getDesc());
                index++;
            }
            System.out.println(index + "-Exit");
            System.out.println("Seçiminiz : ");
            int nextIntLoc = scParam.nextInt();
            if ((nextIntLoc >= 1) && (nextIntLoc <= commandsLoc.size())) {
                IAtmCommand iAtmCommandLoc = commandsLoc.get(nextIntLoc - 1);
                iAtmCommandLoc.execute(scParam);
            } else {
                break;
            }
        }
    }

}
