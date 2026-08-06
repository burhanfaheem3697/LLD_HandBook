package com.example.Calculator;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LegacyCalculatorTest {
    private LegacyCalculator calculator;

    @BeforeEach
    void setup(){
        calculator = new LegacyCalculator();
    }



    @Test
    void testForCorrectCalculation(){
        assertAll("Check for adding numbers",
            () -> assertEquals(60, calculator.calculateSum("20,10,30")),
            () -> assertEquals(0, calculator.calculateSum("")),
            () -> assertEquals(0,calculator.calculateSum(null))
        );
    }
    
}