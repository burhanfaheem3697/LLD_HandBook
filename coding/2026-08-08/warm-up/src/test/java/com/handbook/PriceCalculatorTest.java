package com.handbook;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * PriceCalculatorTest
 */
public class PriceCalculatorTest {

    private final PriceCalculator calculator = new PriceCalculator();

    @Test
    void testForPriceCalculation(){
        double total = calculator.calculatePrice(10.0, 5.0);
        assertEquals(45.0, total,0.001,"The discount price should 5$");
    }
}