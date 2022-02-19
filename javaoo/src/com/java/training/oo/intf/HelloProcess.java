package com.java.training.oo.intf;

import java.util.function.Supplier;

public class HelloProcess implements IHelloProcess {

    private final IHello           hello;
    private final Supplier<String> menu;


    public HelloProcess(final IHello helloParam,
                        final Supplier<String> menuParam) {
        super();
        this.hello = helloParam;
        this.menu = menuParam;
    }

    @Override
    public IHello helloInterface() {
        return this.hello;
    }

    @Override
    public Supplier<String> helloMenuStr() {
        return this.menu;
    }

}
