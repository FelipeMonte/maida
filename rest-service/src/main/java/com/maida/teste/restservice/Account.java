package com.maida.teste.restservice;

import java.util.ArrayList;

public class Account {
    
    private final long number;
    private int bankBalance; //int for negative balances
    private final ArrayList<Operation> operations;
    
    public Account(long number) {
        this.number = number;
        bankBalance = 0;
        operations = new ArrayList<>();
    }
    
    public long getNumber() {
        return number;
    }
    
    public int getBankBalance() {
        return bankBalance;
    }
    
    public ArrayList<Operation> getOperations() {
        return operations;
    }
    
    public boolean withdraw(int amount) {
        if (bankBalance - amount > 0) {
            bankBalance -= amount;
            operations.add(new Operation('w', -amount));
            return true;
        }
        return false;
    }

    public boolean deposit(int amount) {
        bankBalance += amount;
        operations.add(new Operation('d', amount));
        return true;
    }

    public boolean transfer(int amount, Account destination) {
        if (bankBalance - amount > 0) {
            bankBalance -= amount;
            operations.add(new Operation('t', -amount));
            destination.bankBalance += amount;
            destination.operations.add(new Operation('t', amount));
            return true;
        }
        return false;
    }
}
