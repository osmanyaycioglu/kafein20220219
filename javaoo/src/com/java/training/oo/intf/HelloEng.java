package com.java.training.oo.intf;


public class HelloEng implements IHello, IGreet {

    @Override
    public String hello(final String nameParam,
                        final String surnameParam) {
        return "Hello " + nameParam + " " + surnameParam;
    }

    public String test() {
        return "Test";
    }

    @Override
    public String greetings(final String nameParam,
                            final String surnameParam) {
        return "Greetings " + nameParam + " " + surnameParam;
    }

}
