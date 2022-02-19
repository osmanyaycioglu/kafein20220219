package com.java.training.oo.intf;


public class HelloJp implements IHello, IGreet {

    @Override
    public String hello(final String nameParam,
                        final String surnameParam) {
        return "Haw " + nameParam + " " + surnameParam;
    }

    public String test() {
        return "Test";
    }

    @Override
    public String greetings(final String nameParam,
                            final String surnameParam) {
        return "How " + nameParam + " " + surnameParam;
    }

}
