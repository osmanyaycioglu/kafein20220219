package com.java.training.oo.person;


public class PersonProperties {

    private String language;

    public static PersonProperties newInstance() {
        return new PersonProperties();
    }

    public String getLanguage() {
        return this.language;
    }


    public PersonProperties setLanguage(final String languageParam) {
        this.language = languageParam;
        return this;
    }


}
