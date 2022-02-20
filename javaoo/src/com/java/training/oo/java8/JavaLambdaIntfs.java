package com.java.training.oo.java8;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.java.training.oo.person.Person;

public class JavaLambdaIntfs {

    public static void main(final String[] args) {
        Function<String, Integer> func1 = s -> Integer.parseInt(s);
        IMyFunction func2 = s -> Integer.parseInt(s);
        Function<String, Long> func3 = s -> Long.parseLong(s);
        BiFunction<String, String, Integer> func4 = (a,
                                                     b) -> Integer.parseInt(a) + Integer.parseInt(b);
        Predicate<Integer> pred1 = i -> i > 20;
        System.out.println("pred1 : " + pred1.test(30));
        BiPredicate<Integer, Person> pred2 = (i,
                                              p) -> p.getName()
                                                     .length() > i;

        System.out.println("pred2 : "
                           + pred2.test(10,
                                        Person.newInstance()
                                              .setName("mehmet")));
        Supplier<String> sup1 = () -> "Osman training";
        System.out.println(sup1.get());

        Supplier<Person> sup2 = () -> Person.newInstance()
                                            .setName("mehmet")
                                            .setSurname("alas");
        test1(3,
              sup2);
        test2(3,
              Person.newInstance()
                    .setName("mehmet")
                    .setSurname("alas"));
        Integer a1 = 10;

        log1("test " + 10); // Concat 5micro + memory 1 micro + methodCall 1 micro = 7 micro
        log2(() -> "test " + 10); // 1 micro methodCall

        Consumer<String> consume1 = s -> System.out.println(s);
        Consumer<String> consume2 = System.out::println;

        BinaryOperator<Integer> intBin = (i1,
                                          i2) -> i1 + i2;

        BiFunction<Integer, Integer, Integer> intBin2 = (i1,
                                                         i2) -> i1 + i2;

    }

    public static int LOG_LEVEL = 3;

    public static void log1(final String str) {
        if (JavaLambdaIntfs.LOG_LEVEL > 5) {
            System.out.println(str);
        }
    }

    public static void log2(final Supplier<String> logStr) {
        if (JavaLambdaIntfs.LOG_LEVEL > 5) {
            System.out.println(logStr.get());
        }
    }

    public static void test1(final Integer val1,
                             final Supplier<Person> sup) {
        if (val1 > 5) {
            System.out.println(sup.get());
        } else {
            System.out.println("Not supported");
        }
    }

    public static void test2(final Integer val1,
                             final Person per) {
        if (val1 > 5) {
            System.out.println(per);
        } else {
            System.out.println("Not supported");
        }

    }

}
