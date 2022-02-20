package com.java.training.oo.person.commands;

import java.util.ArrayList;
import java.util.List;

import com.java.training.oo.person.Account;
import com.java.training.oo.person.Person;

public class AtmCommandsFactory {

    public static List<IAtmCommand> getCommands(final Person person) {
        List<IAtmCommand> commandList = new ArrayList<>();
        switch (person.getPersonProperties()
                      .getPersonType()) {
            case SILVER: {
                for (Account accountLoc : person.getAccounts()) {
                    commandList.add(new AccountViewCommand(person,
                                                           accountLoc));
                }
            }
                break;
            case GOLD: {
                for (Account accountLoc : person.getAccounts()) {
                    commandList.add(new AccountViewCommand(person,
                                                           accountLoc));
                    commandList.add(new AccountDepositCommand(person,
                                                              accountLoc));
                }
            }
                break;
            case PLATINIUM: {
                for (Account accountLoc : person.getAccounts()) {
                    commandList.add(new AccountViewCommand(person,
                                                           accountLoc));
                    commandList.add(new AccountDepositCommand(person,
                                                              accountLoc));
                    commandList.add(new AccountWithdrawCommand(person,
                                                               accountLoc));
                }
            }
                break;
            default:
                break;
        }
        return commandList;
    }
}
