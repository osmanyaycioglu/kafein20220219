package com.java.training.string;


public class StringRunner {

    public static void main(final String[] args) {
        String str = "osman";
        String concatLoc = str.concat(" yay");
        str += " yay";
        System.out.println(concatLoc);
        long delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 100_000; iLoc++) {
            str += "" + iLoc;
        }
        System.out.println("Delta : " + (System.currentTimeMillis() - delta));

        StringBuilder builderLoc = new StringBuilder();
        delta = System.currentTimeMillis();
        for (int iLoc = 0; iLoc < 100_000; iLoc++) {
            builderLoc.append(iLoc);
        }
        System.out.println("Delta : " + (System.currentTimeMillis() - delta));

        String gs = "osman" + str + " " + concatLoc;
        gs += " new line";
    }
}
