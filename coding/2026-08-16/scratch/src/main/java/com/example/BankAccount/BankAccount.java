package com.example.BankAccount;

/**
 * BankAccount
 */
public class BankAccount {

    private final String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Amount must be positive");
        }

        balance+=amount;
    }

    public void withdraw(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Amount must be positive");
        }

        if(amount > balance){
            throw new IllegalArgumentException("Not enough money");
        }

        balance-=amount;
    }
    
    public double getBalance(){
        return balance;
    }
}