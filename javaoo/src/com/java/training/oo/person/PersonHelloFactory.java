package com.java.training.oo.person;

import com.java.training.oo.intf.HelloEng;
import com.java.training.oo.intf.HelloEsp;
import com.java.training.oo.intf.HelloJp;
import com.java.training.oo.intf.HelloTr;
import com.java.training.oo.intf.IHello;

public class PersonHelloFactory {

    public static final String LANGUAGE_ENG = "eng";
    public static final String LANGUAGE_TR  = "tr";
    public static final String LANGUAGE_ESP = "esp";
    public static final String LANGUAGE_JP  = "jp";
    public static final String LANGUAGE_GER = "ger";
    public static final String LANGUAGE_POR = "por";
    public static final String LANGUAGE_XYZ = "xyz";

    public static IHello getHello(final String language) {
        IHello hLoc = null;
        switch (language) {
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
