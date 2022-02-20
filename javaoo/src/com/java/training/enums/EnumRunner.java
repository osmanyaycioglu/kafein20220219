package com.java.training.enums;


public class EnumRunner {

    public static void main(final String[] args) {
        EMyEnum eMyEnumLoc = EMyEnum.TFG;
        System.out.println(eMyEnumLoc.generateStr());
        switch (eMyEnumLoc) {
            case ABC:
                break;
            case TFG:
                break;
            case XYZ:
                break;
            default:
                break;
        }
    }
}
