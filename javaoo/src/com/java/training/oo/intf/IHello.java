package com.java.training.oo.intf;


@FunctionalInterface
public interface IHello {

    public static String DEFAULT_NAME = "DEFAULT";

    String hello(String name,
                 String surname);
}
