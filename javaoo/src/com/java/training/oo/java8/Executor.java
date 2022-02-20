package com.java.training.oo.java8;


public class Executor {

    public static void main(final String[] args) {
        String prefixLoc = "Test";
        Integer intVal2 = 15;
        IExecute executeLoc = new ExecuteImpl();
        System.out.println(executeLoc.execute("sonuç",
                                              100));

        IExecute exec2 = new IExecute() {

            @Override
            public String execute(final String strParam,
                                  final Integer int1Param) {
                return prefixLoc + " " + intVal2 + " " + strParam + " = " + int1Param;
            }

        };
        IExecute exec3 = new IExecute() {

            @Override
            public String execute(final String strParam,
                                  final Integer int1Param) {
                return prefixLoc + " " + intVal2 + " " + strParam + " = " + int1Param;
            }

        };

        IExecute exec4 = (str,
                          int1) -> prefixLoc + " " + intVal2 + " " + str + " = " + int1;

        IExecute exec5 = (str,
                          int1) -> {
            System.out.println("multi line test");
            return prefixLoc + " " + intVal2 + " " + str + " = " + int1;
        };

        IExecute exec6 = Executor::xyz;
        Executor executorLoc = new Executor();
        IExecute exec7 = executorLoc::anc;

        System.out.println(exec7.extra("Prefix test",
                                       110));

        IExecute exec8 = (str,
                          int1) -> "test" + " " + intVal2 + " " + str + " = " + int1;
    }

    public static String xyz(final String kls,
                             final Integer vbn) {
        System.out.println("multi line test");
        return kls + " = " + vbn;
    }

    public String anc(final String kls,
                      final Integer vbn) {
        System.out.println("multi line test");
        return kls + " = " + vbn;
    }


}
