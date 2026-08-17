package com.example.ValueObject;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import org.junit.jupiter.api.Test;

public class ValueObjectTest {

    @Test
    void testForCustomerAccount() {
        Address validAddress = new Address("101 St", "San Jose", "95113");
        Money validBalance = new Money(100.0, "USD");

        assertAll("Checks for Customer Account",
            () -> assertThrows(IllegalArgumentException.class, () -> new CustomerAccount(null, validAddress, validBalance), "Account ID can't be null"),
            () -> assertThrows(IllegalArgumentException.class, () -> new CustomerAccount("   ", validAddress, validBalance), "Account ID can't be blank"),
            () -> assertThrows(IllegalArgumentException.class, () -> new CustomerAccount("ACC-1001", null, validBalance), "Address can't be null"),
            () -> assertThrows(IllegalArgumentException.class, () -> new CustomerAccount("ACC-1002", validAddress, null), "Balance can't be null")
        );
    }

    @Test
    void testForMoney() {
        assertAll("Checks for Money",
            () -> assertThrows(IllegalArgumentException.class, () -> new Money(-1.0, "USD"), "Amount can't be negative"),
            () -> assertThrows(IllegalArgumentException.class, () -> new Money(40.0, null), "Currency can't be null"),
            () -> assertThrows(IllegalArgumentException.class, () -> new Money(23.0, "    "), "Currency can't be empty")
        );

        Money usd = new Money(100.0, "USD");
        assertThrows(IllegalArgumentException.class, () -> usd.add(new Money(100.0, "EUR")), "Currency mismatch");
    }

    @Test
    void testForAddress() {
        assertAll("Checks for Address",
            () -> assertThrows(IllegalArgumentException.class, () -> new Address(null, "San Jose", "95113"), "Street can't be null"),
            () -> assertThrows(IllegalArgumentException.class, () -> new Address("123 St", null, "95113"), "City can't be null"),
            () -> assertThrows(IllegalArgumentException.class, () -> new Address("123 St", "San Jose", null), "Zip code can't be null")
        );
    }

    @Test
    void testForAuditLogsEncapsulation() {
        Address address = new Address("100 Main St", "Boston", "02108");
        Money balance = new Money(250.0, "USD");
        CustomerAccount account = new CustomerAccount("ACC-1001", address, balance);

        List<String> auditLogs = account.getAuditLogs();
        assertThrows(UnsupportedOperationException.class, () -> auditLogs.clear(), "Can't modify the structure of immutable list");
    }
}