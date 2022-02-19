package com.java.training.oo.intf;

import java.util.Scanner;

public class HelloRun {

    public void runoo2() {
        HelloFactoryEx factoryExLoc = new HelloFactoryEx();
        try (Scanner sc = new Scanner(System.in)) {
            factoryExLoc.printMenu();
            int nextIntLoc = sc.nextInt();
            IHello hLoc = factoryExLoc.createHello(nextIntLoc);
            // Code bloğu
            String helloLoc = hLoc.hello("osman",
                                         "yay");
            System.out.println(helloLoc);

        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }

    public void runoo() {
        try (Scanner sc = new Scanner(System.in)) {
            HelloFactory.printMenu();
            int nextIntLoc = sc.nextInt();
            IHello hLoc = HelloFactory.createHello(nextIntLoc);
            // Code bloğu
            String helloLoc = hLoc.hello("osman",
                                         "yay");
            System.out.println(helloLoc);

        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }

    //    public void run() {
    //        try (Scanner sc = new Scanner(System.in)) {
    //            System.out.println("1-Eng");
    //            System.out.println("2-Tr");
    //            System.out.println("3-Esp");
    //            System.out.println("4-Esp");
    //            System.out.println("Seçiminiz : ");
    //            int nextIntLoc = sc.nextInt();
    //            IHello hLoc = null;
    //            switch (nextIntLoc) {
    //                case HelloFactory.LANGUAGE_ENG:
    //                    hLoc = new HelloEng();
    //                    break;
    //                case HelloFactory.LANGUAGE_TR:
    //                    hLoc = new HelloTr();
    //                    break;
    //                case HelloFactory.LANGUAGE_ESP:
    //                    hLoc = new HelloEsp();
    //                    break;
    //                case HelloFactory.LANGUAGE_JP:
    //                    hLoc = new HelloEsp();
    //                    break;
    //                default:
    //                    hLoc = new HelloEng();
    //                    break;
    //            }
    //            // Code bloğu
    //            String helloLoc = hLoc.hello("osman",
    //                                         "yay");
    //            System.out.println(helloLoc);
    //
    //        } catch (Exception eLoc) {
    //            eLoc.printStackTrace();
    //        }
    //    }

    public static void main(final String[] args) {
        HelloRun helloRunLoc = new HelloRun();
        helloRunLoc.runoo2();
    }
}
