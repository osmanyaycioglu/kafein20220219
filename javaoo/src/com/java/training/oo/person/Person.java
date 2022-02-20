package com.java.training.oo.person;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Person {

    private String           name;
    private String           surname;
    private String           username;
    private String           password;
    private PersonProperties personProperties;
    private List<Account>    accounts;


    public Person fillAccouns(final String accountString) {
        String[] splitLoc = accountString.split(";");
        for (int iLoc = 0; iLoc < splitLoc.length; iLoc = iLoc + 3) {
            Account accountLoc = new Account();
            accountLoc.setAccountName(splitLoc[iLoc]);
            accountLoc.setAccountType(EAccountType.valueOf(splitLoc[iLoc + 1]));
            accountLoc.setAmount(new BigDecimal(splitLoc[iLoc + 2]));
            this.addAccount(accountLoc);
        }
        return this;
    }

    public Person addAccount(final Account accountParam) {
        if (this.accounts == null) {
            this.accounts = new ArrayList<>();
        }
        this.accounts.add(accountParam);
        return this;
    }

    public Iterator<Account> getAccountIterator() {
        return this.accounts.iterator();
    }

    public List<Account> getAccounts() {
        return this.accounts;
    }

    public Person setAccounts(final List<Account> accountsParam) {
        this.accounts = accountsParam;
        return this;
    }

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
               + ", accounts="
               + this.accounts
               + "]";
    }


}
