package com.example.cli_dispatcher;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * SimpleCliDispatcherTest
 */
public class SimpleCliDispatcherTest {

    private SimpleCliDispatcher cliDispatcher;

    @BeforeEach
    void setup(){
        cliDispatcher = new SimpleCliDispatcher();
    }

    @Test
    void testForAddAndListCommandArgs(){
        assertAll("Test for addition and lists arguments",
            () -> assertEquals("Executing ADD Tasks: Hell.java", cliDispatcher.dispatch(new String[]{"add","Hell.java"})),
            () -> assertEquals("Executing LIST Tasks", cliDispatcher.dispatch(new String[]{"LIST"})),
            () -> assertEquals("Executing COMPLETE for ID: Hell.java", cliDispatcher.dispatch(new String[]{"complete","Hell.java"})),
            () -> assertThrows(IllegalArgumentException.class, () -> cliDispatcher.dispatch(new String[]{"random command"}))
        );
    }

    @Test
    void testForInvalidLengthForAddAndComplete(){
        assertAll("Checking for invalid lengths",
            () -> assertThrows(IllegalArgumentException.class, () -> cliDispatcher.dispatch(new String[]{"add"})),
            () -> assertThrows(IllegalArgumentException.class, () -> cliDispatcher.dispatch(new String[]{"complete"}))
        );
    }

    @Test
    void testForEmptyArgThrowsException(){
        assertAll("Checking for empty or null value",
            () -> assertThrows(IllegalArgumentException.class, () -> cliDispatcher.dispatch(null)),
            () -> assertThrows(IllegalArgumentException.class, () -> cliDispatcher.dispatch(new String[]{}))
        );
    }
}