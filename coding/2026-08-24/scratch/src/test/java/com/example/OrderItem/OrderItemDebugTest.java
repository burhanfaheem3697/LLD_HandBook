package com.example.OrderItem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * OrderItemDebugTest
 */
public class OrderItemDebugTest {

    private OrderItemDebug orderItemDebug;

    @BeforeEach
    void setup(){
        orderItemDebug = new OrderItemDebug("ITEM-101", 4, 50.0);
    }

    @Test
    void testGetTotalPriceMethod(){
        assertEquals(200.0, orderItemDebug.getTotalPrice(),0.001);
    }

    @Test
    void testInvalidQuantityThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> new OrderItemDebug("ITEM-101", -1, 900.0));
    }

    @Test
    void testInvalidUnitPriceThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> new OrderItemDebug("ITEM-101", 3, -1.0));
    }

    @Test
    void testInvalidProductIdThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> new OrderItemDebug(null, 0, 0));
        assertThrows(IllegalArgumentException.class, () -> new OrderItemDebug("     ", 0, 0));
    }


}