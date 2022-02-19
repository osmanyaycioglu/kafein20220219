package com.java.training.oo.intf;


public class HelloEsp implements IHello, IGreet {

    @Override
    public String hello(final String nameParam,
                        final String surnameParam) {
        return "Ola " + nameParam + " " + surnameParam;
    }

    public String test() {
        return "Test";
    }

    @Override
    public String greetings(final String nameParam,
                            final String surnameParam) {
        return "Hola " + nameParam + " " + surnameParam;
    }

}
