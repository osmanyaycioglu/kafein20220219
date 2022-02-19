package com.java.training.oo.intf;


public class HelloCn implements IHello {

    @Override
    public String hello(final String nameParam,
                        final String surnameParam) {
        return "Mao " + nameParam + " " + surnameParam;
    }


}
