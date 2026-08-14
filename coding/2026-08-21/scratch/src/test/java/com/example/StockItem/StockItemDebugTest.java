package com.example.StockItem;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * StockItemDebugTest
 */
public class StockItemDebugTest {

    private StockItemDebug stockItemDebug;

    @BeforeEach
    void setup(){
        stockItemDebug = new StockItemDebug(500);
    }

    @Test
    void testForExceedingTotalQuantityThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> stockItemDebug.reserveStock(600));
    }

    @Test
    void testForInvalidAmountInReservedStockThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> stockItemDebug.reserveStock(-1));
    }

    @Test
    void testForValidAmountInReservedStock(){
        stockItemDebug.reserveStock(200);
        assertAll(
            () -> assertEquals(200, stockItemDebug.getReservedQuantity()),
            () -> assertEquals(500,stockItemDebug.getTotalQuantity()),
            () -> assertEquals(300,stockItemDebug.getAvailableStock())
            );
    }
}