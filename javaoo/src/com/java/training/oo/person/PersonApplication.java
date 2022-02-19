package com.java.training.oo.person;

import java.util.List;
import java.util.Scanner;

import com.java.training.oo.intf.IHello;

public class PersonApplication {

    private final PersonDataReader personDataReader = new PersonDataReader();
    private final PersonManager    personManager    = new PersonManager();

    public void start() {
        List<Person> readPersonsLoc = this.personDataReader.readPersons("person.txt");
        this.personManager.refresh(readPersonsLoc);
    }

    public void login() {
        try (Scanner sc = new Scanner(System.in)) {
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
        } catch (PersonAppException eLoc) {
            System.out.println("Application problemi : " + eLoc.getMessage());
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }

}
