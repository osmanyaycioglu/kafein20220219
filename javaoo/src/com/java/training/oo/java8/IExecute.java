package com.java.training.oo.java8;

@FunctionalInterface
public interface IExecute {

    String execute(String str,
                   Integer int1);

    default String extra(final String prefix,
                         final Integer abc) {
        return prefix
               + "  "
               + this.execute("sonuç",
                              abc);
    }

    default String pref(final String prefix) {
        return prefix;
    }
}
