package com.java.training.oo.person;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class PersonDataReader {

    public List<Person> readPersons(final String filename) {
        try {
            Path pathLoc = Paths.get(filename);
            return Files.readAllLines(pathLoc)
                        .stream()
                        .map(s -> s.split(","))
                        .filter(PersonDataReader::cvb)
                        .map(sa -> Person.newInstance()
                                         .setName(sa[0])
                                         .setSurname(sa[1])
                                         .setUsername(sa[2])
                                         .setPassword(sa[3])
                                         .setPersonProperties(PersonProperties.newInstance()
                                                                              .setLanguage(sa[4])
                                                                              .setPersonType(EPersonType.valueOf(sa[5])))
                                         .fillAccouns(sa[6]))
                        .collect(Collectors.toList());
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
        return null;
    }

    public static boolean cvb(final String[] sa) {
        boolean ret = sa.length == 7;
        if (!ret) {
            System.err.println("Yanlış satır : "
                               + Arrays.asList(sa)
                                       .stream()
                                       .collect(Collectors.toList()));
        }
        return ret;
    }

    public List<Person> readPersons2(final String filename) {
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
