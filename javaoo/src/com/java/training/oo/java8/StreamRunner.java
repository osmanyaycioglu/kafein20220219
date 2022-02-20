package com.java.training.oo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamRunner {

    public static void main(final String[] args) {
        List<String> list1Loc = Arrays.asList("osman",
                                              "mehmet",
                                              "ali",
                                              "veli",
                                              "ayşe",
                                              "fatma",
                                              "osman",
                                              "ayşe",
                                              "veli");

        list1Loc.parallelStream()
                .filter(s -> {
                    System.out.println("Thread : "
                                       + Thread.currentThread()
                                               .getName());
                    return s.length() >= 5;
                })
                .peek(s -> {
                    System.out.println("Thread : "
                                       + Thread.currentThread()
                                               .getName());
                    System.out.println("peek 1 : " + s);
                })
                .filter(s -> {
                    System.out.println("Thread : "
                                       + Thread.currentThread()
                                               .getName());
                    return s.contains("a");
                })
                .peek(s -> {
                    System.out.println("Thread : "
                                       + Thread.currentThread()
                                               .getName());
                    System.out.println("peek 2 : " + s);
                })
                .sorted()
                .forEach(s -> {
                    System.out.println("End Thread : "
                                       + Thread.currentThread()
                                               .getName());
                    System.out.println("Data : " + s);
                });
        System.out.println("-----------------------");
        List<String> collectLoc = list1Loc.stream()
                                          .distinct()
                                          .sorted()
                                          .filter(s -> s.length() >= 5)
                                          .filter(s -> s.contains("a"))
                                          .collect(Collectors.toList());
        System.out.println(collectLoc);

    }
}
