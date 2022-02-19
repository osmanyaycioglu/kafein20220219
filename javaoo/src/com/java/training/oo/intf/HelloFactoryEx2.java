package com.java.training.oo.intf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HelloFactoryEx2 {

    public static class HelloHolder {

        String language;
        IHello hello;
    }

    private final Map<Integer, HelloHolder> helloProcesses2 = new TreeMap<>();
    //private final Map<Integer, Map<String, IHello>> helloProcesses2 = new TreeMap<>();

    private final Map<String, IHello> helloProcesses = new TreeMap<>();
    private final List<String>        keyIndex       = new ArrayList<>();

    public HelloFactoryEx2() {
        this.helloProcesses.put("English",
                                new HelloEng());
        this.keyIndex.add("English");
        this.helloProcesses.put("Turkish",
                                new HelloTr());
        this.keyIndex.add("Turkish");
        this.helloProcesses.put("Spanish",
                                new HelloEsp());
        this.keyIndex.add("Spanish");
        this.helloProcesses.put("Japanese",
                                new HelloJp());
        this.keyIndex.add("Japanese");
        this.helloProcesses.put("Chinese",
                                new HelloCn());
        this.keyIndex.add("Chinese");
        this.helloProcesses.put("Dutch",
                                new IHello() {

                                    @Override
                                    public String hello(final String nameParam,
                                                        final String surnameParam) {
                                        return "Hallo " + nameParam + " " + surnameParam;
                                    }
                                });
        this.keyIndex.add("Dutch");
        this.helloProcesses.put("Latin",
                                (n,
                                 s) -> "Kallo " + n + " " + s);
        this.keyIndex.add("Latin");
    }

    public void printMenu() {
        for (int iLoc = 0; iLoc < this.keyIndex.size(); iLoc++) {
            String stringLoc = this.keyIndex.get(iLoc);
            System.out.println((iLoc + 1) + "-" + stringLoc);
        }
        System.out.println("Seçiminiz : ");
    }

    public IHello createHello(final int index) {
        if (index > this.keyIndex.size()) {
            return null;
        }
        String stringLoc = this.keyIndex.get(index - 1);

        return this.helloProcesses.get(stringLoc);
    }
}
