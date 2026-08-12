package com.example.BankAccount2;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * BankAccountTest
 */
public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setup(){
        account = new BankAccount("ACC-101", 200.0);
    }

    @Test
    void testForEqualHashCode(){
        Set<BankAccount> st = new HashSet<>();
        st.add(account);
        assertTrue(st.contains(new BankAccount("ACC-101", 200.0)));
    }

    @Test
    void testEqualsReflexive(){
        assertTrue(account.equals(account));
    }

    @Test
    void testEqualsSymmetric(){
        BankAccount account2 = new BankAccount("ACC-101", 200.0);
        assertTrue(account.equals(account2) == account2.equals(account));
    }

    
}