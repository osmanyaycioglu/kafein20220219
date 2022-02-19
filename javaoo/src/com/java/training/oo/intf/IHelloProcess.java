package com.java.training.oo.intf;

import java.util.function.Supplier;

public interface IHelloProcess {

    IHello helloInterface();

    Supplier<String> helloMenuStr();

}
