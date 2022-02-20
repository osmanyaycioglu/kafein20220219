package com.java.training.oo.person.commands;

import java.util.Scanner;

import com.java.training.oo.person.Account;
import com.java.training.oo.person.Person;

public class AccountViewCommand implements IAtmCommand {

    private final Person  person;
    private final Account account;

    public AccountViewCommand(final Person personParam,
                              final Account accountParam) {
        super();
        this.person = personParam;
        this.account = accountParam;
    }

    @Override
    public void execute(final Scanner sccanerParam) {
        System.out.println("-----------------VIEW----------------------");
        System.out.println("Sevgili " + this.person.getName() + " " + this.person.getSurname());
        System.out.println(this.account.getAccountName()
                           + " - "
                           + this.account.getAccountType()
                           + " hesabınızda ki para : "
                           + this.account.getAmount());
        System.out.println("");
    }

    @Override
    public String getDesc() {
        return this.account.getAccountName() + "-" + this.account.getAccountType() + " hesabını görün";
    }

}
