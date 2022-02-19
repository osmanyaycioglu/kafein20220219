package com.java.training.oo.intf;

import java.util.ArrayList;
import java.util.List;

public class HelloFactoryEx {

    private final List<IHelloProcess> helloProcesses = new ArrayList<>();


    public HelloFactoryEx() {
        this.helloProcesses.add(new HelloProcess(new HelloEng(),
                                                 () -> "English"));
        this.helloProcesses.add(new HelloProcess(new HelloTr(),
                                                 () -> "Turkish"));
        this.helloProcesses.add(new HelloProcess(new HelloEsp(),
                                                 () -> "Spanish"));
        this.helloProcesses.add(new HelloProcess(new HelloJp(),
                                                 () -> "Japanese"));
        this.helloProcesses.add(new HelloProcess(new HelloCn(),
                                                 () -> "Chinese"));
        this.helloProcesses.add(new HelloProcess(new IHello() {

            @Override
            public String hello(final String nameParam,
                                final String surnameParam) {
                return "Hallo " + nameParam + " " + surnameParam;
            }
        },
                                                 () -> "Dutch"));
        this.helloProcesses.add(new HelloProcess((n,
                                                  s) -> "Kallo " + n + " " + s,
                                                 () -> "Latin"));
        this.helloProcesses.add(new HelloProcess((n,
                                                  s) -> "XYZ " + n + " " + s,
                                                 () -> "XYZ"));
        this.helloProcesses.add(new HelloProcess((n,
                                                  s) -> "Arabic selam " + n + " " + s,
                                                 () -> "Arabic"));

    }

    public void printMenu() {
        for (int iLoc = 0; iLoc < this.helloProcesses.size(); iLoc++) {
            IHelloProcess iHelloProcessLoc = this.helloProcesses.get(iLoc);
            System.out.println((iLoc + 1)
                               + "-"
                               + iHelloProcessLoc.helloMenuStr()
                                                 .get());
        }
        System.out.println("Seçiminiz : ");
    }

    public IHello createHello(final int index) {
        if (index > this.helloProcesses.size()) {
            return null;
        }
        return this.helloProcesses.get(index - 1)
                                  .helloInterface();
    }
}
