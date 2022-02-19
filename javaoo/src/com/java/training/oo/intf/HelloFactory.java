package com.java.training.oo.intf;


public class HelloFactory {

    public static final int LANGUAGE_ENG = 1;
    public static final int LANGUAGE_TR  = 2;
    public static final int LANGUAGE_ESP = 3;
    public static final int LANGUAGE_JP  = 4;
    public static final int LANGUAGE_GER = 5;
    public static final int LANGUAGE_POR = 6;
    public static final int LANGUAGE_XYZ = 7;

    public static void printMenu() {
        System.out.println("1-Eng");
        System.out.println("2-Tr");
        System.out.println("3-Esp");
        System.out.println("4-jp");
        System.out.println("5-Ger");
        System.out.println("6-Por");
        System.out.println("7-XYZ");
        System.out.println("Seçiminiz : ");
    }

    public static IHello createHello(final int index) {
        IHello hLoc = null;
        switch (index) {
            case LANGUAGE_ENG:
                hLoc = new HelloEng();
                break;
            case LANGUAGE_TR:
                hLoc = new HelloTr();
                break;
            case LANGUAGE_ESP:
                hLoc = new HelloEsp();
                break;
            case LANGUAGE_JP:
                hLoc = new HelloJp();
                break;
            case LANGUAGE_GER:
                hLoc = new IHello() {

                    @Override
                    public String hello(final String nameParam,
                                        final String surnameParam) {
                        return "Hallo " + nameParam + " " + surnameParam;
                    }
                };
                break;
            case LANGUAGE_POR:
                hLoc = (n,
                        s) -> "Kallo " + n + " " + s;
                break;
            case LANGUAGE_XYZ:
                hLoc = (n,
                        s) -> "XYZ " + n + " " + s;
                break;

            default:
                hLoc = new HelloEng();
                break;
        }
        return hLoc;
    }
}
