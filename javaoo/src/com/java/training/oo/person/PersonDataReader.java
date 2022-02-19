package com.java.training.oo.person;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class PersonDataReader {

    public List<Person> readPersons(final String filename) {
        List<Person> personsLoc = new ArrayList<>();
        try {
            Path pathLoc = Paths.get(filename);
            List<String> readAllLinesLoc = Files.readAllLines(pathLoc);
            for (String lineLoc : readAllLinesLoc) {
                // osman,yay,osmanyay,1234,tr
                String[] splitLoc = lineLoc.split(",");
                if (splitLoc.length == 5) {
                    personsLoc.add(Person.newInstance()
                                         .setName(splitLoc[0])
                                         .setSurname(splitLoc[1])
                                         .setUsername(splitLoc[2])
                                         .setPassword(splitLoc[3])
                                         .setPersonProperties(PersonProperties.newInstance()
                                                                              .setLanguage(splitLoc[4])));
                } else {
                    System.err.println("Yanlış satır : " + lineLoc);
                }
            }
            return personsLoc;
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
        return null;
    }

    public static void main(final String[] args) {
        PersonDataReader dataReaderLoc = new PersonDataReader();
        List<Person> readPersonsLoc = dataReaderLoc.readPersons("person.txt");
        for (Person personLoc : readPersonsLoc) {
            System.out.println("read person : " + personLoc);
        }
    }

}
