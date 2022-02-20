package com.java.training.oo.person;

import java.util.Scanner;

public class PersonAppRunner {

    public static void main(final String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            PersonApplication applicationLoc = new PersonApplication();
            applicationLoc.start();
            Person loginLoc = applicationLoc.login(sc);
            if (loginLoc == null) {
                System.exit(0);
            }
            applicationLoc.menu(sc,
                                loginLoc);

        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }

}
