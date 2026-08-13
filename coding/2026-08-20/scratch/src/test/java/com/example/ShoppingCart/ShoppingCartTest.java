package com.example.ShoppingCart;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * ShoppingCartTest
 */
public class ShoppingCartTest {

    private ShoppingCart cart;

    @BeforeEach
    void setup() {
        cart = new ShoppingCart();
    }

    @Test
    void testForModifyingItems() {
        cart.addItem("Hello");
        assertEquals(1, cart.getItems().size());
        assertAll(
                () -> assertThrows(UnsupportedOperationException.class, () -> cart.getItems().clear()),
                () -> assertThrows(UnsupportedOperationException.class, () -> cart.getItems().add("Hello")),
                () -> assertThrows(IllegalArgumentException.class, () -> cart.addItem(null)),
                () -> assertThrows(IllegalArgumentException.class, () -> cart.addItem("     ")));

    }
}