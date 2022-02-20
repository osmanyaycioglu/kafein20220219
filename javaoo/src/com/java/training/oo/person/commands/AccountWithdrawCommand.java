package com.java.training.oo.person.commands;

import com.java.training.oo.person.Account;
import com.java.training.oo.person.Person;

public class AccountWithdrawCommand extends AccountMoneyCommand {

    public AccountWithdrawCommand(final Person personParam,
                                  final Account accountParam) {
        super(personParam,
              accountParam,
              "WITHDRAW",
              "Çekeceğiniz",
              "çekildi",
              "hesaptan para çek",
              EActionType.WITHDRAW);
    }


}
