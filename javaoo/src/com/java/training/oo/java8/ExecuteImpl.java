package com.java.training.oo.java8;


public class ExecuteImpl implements IExecute {

    @Override
    public String execute(final String strParam,
                          final Integer int1Param) {
        return strParam + " = " + int1Param;
    }

}
