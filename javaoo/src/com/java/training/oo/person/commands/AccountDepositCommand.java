package com.java.training.oo.person.commands;

import com.java.training.oo.person.Account;
import com.java.training.oo.person.Person;

public class AccountDepositCommand extends AccountMoneyCommand {

    public AccountDepositCommand(final Person personParam,
                                 final Account accountParam) {
        super(personParam,
              accountParam,
              "DEPOSIT",
              "Yatıracağınız",
              "yatırıldı",
              "hesaba para yatır",
              EActionType.DEPOSIT);
    }

}
