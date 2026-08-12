package com.example.BankAccount2;

import java.util.Objects;

/**
 * BankAccount
 */
public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance){
        if(accountNumber == null || accountNumber.trim().isEmpty()){
            throw new IllegalArgumentException("Account number is required");
        }

        if(balance <= 0){
            throw new IllegalArgumentException("Balance must be positive");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }

        if(!(o instanceof BankAccount)){
            return false;
        }

        BankAccount that = (BankAccount) o;

        boolean accountNumberEquals = (this.accountNumber == null && that.accountNumber == null) || (this.accountNumber != null && this.accountNumber.equals(that.accountNumber));


        return Double.compare(this.balance, that.balance) == 0 && accountNumberEquals;
    }

    @Override
    public int hashCode(){
        return Objects.hash(accountNumber,balance);
    }

    public void deposit(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("amount must be positive");
        }

        balance+=amount;
    }

    public void withdraw(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("amount must be positive");
        }

        if(amount > balance){
            throw new IllegalArgumentException("Not enough money");
        }

        balance-=amount;
    }

}