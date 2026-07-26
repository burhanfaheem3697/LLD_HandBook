package com.handbook.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * ServiceAppTest
 */
public class ServiceAppTest {
    private ServiceApp app;

    @BeforeEach
    void setup(){
        app = new ServiceApp();
    }
    @Test
    void testStatus(){
        assertEquals("OPERATIONAL",app.getString(),"The status is not equal!");
    }
}