package com.java.training.oo.person.commands;

import java.math.BigDecimal;
import java.util.Scanner;

import com.java.training.oo.person.Account;
import com.java.training.oo.person.Person;

public abstract class AccountMoneyCommand implements IAtmCommand {

    private final Person      person;
    private final Account     account;
    private final String      commandName;
    private final String      actionString;
    private final String      resultString;
    private final String      actionDescString;
    private final EActionType actionType;


    public AccountMoneyCommand(final Person personParam,
                               final Account accountParam,
                               final String commandNameParam,
                               final String actionStringParam,
                               final String resultStringParam,
                               final String actionDescStringParam,
                               final EActionType actionTypeParam) {
        super();
        this.person = personParam;
        this.account = accountParam;
        this.commandName = commandNameParam;
        this.actionString = actionStringParam;
        this.resultString = resultStringParam;
        this.actionDescString = actionDescStringParam;
        this.actionType = actionTypeParam;
    }

    @Override
    public void execute(final Scanner sccanerParam) {
        System.out.println("-----------------" + this.commandName + "----------------------");
        System.out.println("Sevgili " + this.person.getName() + " " + this.person.getSurname());
        System.out.println(this.account.getAccountName()
                           + " - "
                           + this.account.getAccountType()
                           + " hesabınızda ki para : "
                           + this.account.getAmount());
        System.out.println(this.actionString + " miktar : ");
        BigDecimal nextBigDecimalLoc = sccanerParam.nextBigDecimal();
        BigDecimal amountLoc = this.account.getAmount();
        BigDecimal resultLoc = null;
        switch (this.actionType) {
            case DEPOSIT:
                resultLoc = amountLoc.add(nextBigDecimalLoc);
                break;
            case WITHDRAW:
                resultLoc = amountLoc.subtract(nextBigDecimalLoc);
                break;
            default:
                break;
        }

        this.account.setAmount(resultLoc);
        System.out.println("Hesabınıza " + nextBigDecimalLoc + " kadar para " + this.resultString);
        System.out.println("");
    }

    @Override
    public String getDesc() {
        return this.account.getAccountName() + "-" + this.account.getAccountType() + " " + this.actionDescString;
    }
}
