package com.java.training.oo.person.commands;

import java.util.Scanner;

public interface IAtmCommand {

    void execute(Scanner sccanerParam);

    String getDesc();
}
