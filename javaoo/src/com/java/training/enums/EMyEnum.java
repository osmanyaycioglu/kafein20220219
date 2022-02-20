package com.java.training.enums;

public enum EMyEnum {

    XYZ("test1", 1002, EErrorCat.SYSTEM) {

        @Override
        public String generateStr() {
            return "Yaratıyorum : " + this.str;
        }
    },
    ABC("test2", 1003, EErrorCat.INTEGRATION),
    TFG("test3", 1004, EErrorCat.INTERNAL);

    protected String        str;
    protected final Integer errCause;
    private final EErrorCat cat;

    private EMyEnum(final String strParam,
                    final Integer errCause,
                    final EErrorCat catParam) {
        this.str = strParam;
        this.errCause = errCause;
        this.cat = catParam;
    }

    public String generateStr() {
        return "Generating : " + this.str;
    }

    public EErrorCat getCat() {
        return this.cat;
    }

}
