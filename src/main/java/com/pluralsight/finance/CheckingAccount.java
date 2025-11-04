package com.pluralsight.finance;

import java.util.Scanner;

public class CheckingAccount extends Account {
    Scanner scanner = new Scanner(System.in);

    public CheckingAccount(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    public double deposit(double amount) {
        double newBalance = getBalance() + amount;
        setBalance(newBalance);
        return newBalance;
    }

    public double withdraw(double amount) {
        return setBalance(getBalance() - amount);
    }

    @Override
    public double getValue() {
        return 0;
    }
}
