package com.company;

import java.util.ArrayList;

public class Customer {
    private int customerID;
    private String name;
    private ArrayList<BankAccount> accounts;

    public Customer(String customerName, int taxID){
        customerID = taxID;
        this.name = name;
    }
    public boolean openAccount(double initalDeposit){
        var newAccount = new BankAccount();
        newAccount.deposit(initalDeposit);
        var didSucceed = accounts.add(newAccount);
        return didSucceed;
    }

    public int getID(){
        return customerID;
    }

    public String getName(){
        return name;
    }
}

