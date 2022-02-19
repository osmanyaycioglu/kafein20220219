package com.java.training.oo.person;


public class Person {

    private String           name;
    private String           surname;
    private String           username;
    private String           password;
    private PersonProperties personProperties;

    public static Person newInstance() {
        return new Person();
    }

    public String getName() {
        return this.name;
    }

    public Person setName(final String nameParam) {
        this.name = nameParam;
        return this;
    }

    public String getSurname() {
        return this.surname;
    }

    public Person setSurname(final String surnameParam) {
        this.surname = surnameParam;
        return this;
    }

    public String getUsername() {
        return this.username;
    }

    public Person setUsername(final String usernameParam) {
        this.username = usernameParam;
        return this;
    }

    public String getPassword() {
        return this.password;
    }

    public Person setPassword(final String passwordParam) {
        this.password = passwordParam;
        return this;
    }

    public PersonProperties getPersonProperties() {
        return this.personProperties;
    }

    public Person setPersonProperties(final PersonProperties personPropertiesParam) {
        this.personProperties = personPropertiesParam;
        return this;
    }

    @Override
    public String toString() {
        return "Person [name="
               + this.name
               + ", surname="
               + this.surname
               + ", username="
               + this.username
               + ", password="
               + this.password
               + ", personProperties="
               + this.personProperties
               + "]";
    }


}
