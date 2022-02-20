package com.java.training.oo.java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java.training.oo.person.Person;

public class StreamRunner2 {

    public static void main(final String[] args) {
        List<String> list1Loc = Arrays.asList("osman",
                                              "mehmet",
                                              "ali",
                                              "aliveli",
                                              "mehmetali",
                                              "veli",
                                              "ayşe",
                                              "fatma",
                                              "osman",
                                              "ayşe",
                                              "veli");

        System.out.println("-----------------------");
        Stream<Integer> mapLoc = list1Loc.stream()
                                         .distinct()
                                         .sorted()
                                         .filter(s -> s.length() >= 5)
                                         .map(s -> s.length());
        //                .filter(i -> i > 6)
        //                .reduce(0,
        //                        (t,
        //                         i) -> t + i);
        //                                          .filter(s -> s.contains("a"))
        //                                          .collect(Collectors.toList());
        // System.out.println(collectLoc);

        Map<String, Person> collectLoc = list1Loc.stream()
                                                 .distinct()
                                                 .sorted()
                                                 .filter(s -> s.length() >= 5)
                                                 .map(s -> Person.newInstance()
                                                                 .setName(s))
                                                 .filter(p -> p.getName()
                                                               .contains("a"))
                                                 .peek(p -> System.out.println(p))
                                                 .collect(Collectors.toMap(p -> p.getName(),
                                                                           p -> p));
        IntSummaryStatistics summaryStatisticsLoc = list1Loc.stream()
                                                            .distinct()
                                                            .sorted()
                                                            .filter(s -> s.length() >= 5)
                                                            .mapToInt(s -> s.length())
                                                            .summaryStatistics();
        System.out.println(summaryStatisticsLoc);
    }
}
