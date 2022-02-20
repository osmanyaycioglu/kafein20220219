package com.java.training.oo.java8;


public class ExcutorEx {

    public static void main(final String[] args) {
        IExecuteEx exLoc = (a,
                            f,
                            l) -> " " + a + " " + f + " " + l;
        IExecuteEx2 ex2Loc = vo -> "TEst " + vo;
        IExecuteEx3 ex3Loc = () -> "Test me";
    }
}
