package com.handbook.billing;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * PaymentProcessorTest
 */
public class PaymentProcessorTest {
    private PaymentProcessor processor;

    @BeforeEach
    void setup(){
        processor = new PaymentProcessor();
    }

    @Test
    void testForProcessMethod(){
        assertAll("Tests for process method",
            () -> assertFalse(processor.process(-1),"Should return false for negative amount"),
            () -> assertTrue(processor.process(15.0),"Should return true for successfull calculation")
        );
    }
}