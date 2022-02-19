package com.java.training.oo.intf;


public class HelloTr implements IHello, IGreet {

    @Override
    public String hello(final String nameParam,
                        final String surnameParam) {
        return "Selam " + nameParam + " " + surnameParam;
    }

    public String test() {
        return "Test";
    }

    @Override
    public String greetings(final String nameParam,
                            final String surnameParam) {
        return "Merhabalar " + nameParam + " " + surnameParam;
    }

}
