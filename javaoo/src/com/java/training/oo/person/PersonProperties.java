package com.java.training.oo.person;


public class PersonProperties {

    private String      language;
    private EPersonType personType;

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

    public EPersonType getPersonType() {
        return this.personType;
    }

    public PersonProperties setPersonType(final EPersonType personTypeParam) {
        this.personType = personTypeParam;
        return this;
    }

    @Override
    public String toString() {
        return "PersonProperties [language=" + this.language + ", personType=" + this.personType + "]";
    }


}
