package com.example.BankAccount;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * BankAccountTest
 */
public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setup(){
        account = new BankAccount("ACC-101", 500.0);
    }

    @Test
    void testForDeposit(){
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-1.0));
        account.deposit(300.0);
        assertEquals(800.0, account.getBalance());
    }


    @Test
    void testForWithdraw(){
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-1.0));
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(600.0));
        account.withdraw(300.0);
        assertEquals(200.0, account.getBalance());
    }
}