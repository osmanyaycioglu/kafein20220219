package com.java.training.oo.person;

import java.math.BigDecimal;

public class Account {

    private String       accountName;
    private EAccountType accountType;
    private BigDecimal   amount;

    public static Account newInstance() {
        return new Account();
    }

    public String getAccountName() {
        return this.accountName;
    }

    public Account setAccountName(final String accountNameParam) {
        this.accountName = accountNameParam;
        return this;
    }

    public EAccountType getAccountType() {
        return this.accountType;
    }

    public Account setAccountType(final EAccountType accountTypeParam) {
        this.accountType = accountTypeParam;
        return this;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public Account setAmount(final BigDecimal amountParam) {
        this.amount = amountParam;
        return this;
    }

    @Override
    public String toString() {
        return "Account [accountName="
               + this.accountName
               + ", accountType="
               + this.accountType
               + ", amount="
               + this.amount
               + "]";
    }


}
