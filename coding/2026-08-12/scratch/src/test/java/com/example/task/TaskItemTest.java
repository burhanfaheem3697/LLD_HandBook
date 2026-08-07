package com.example.task;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * TaskItemTest
 */
public class TaskItemTest {

    @Test
    void testForConstructorValidations(){
        assertAll("Checking constructor validations",
            () -> assertThrows(IllegalArgumentException.class, () -> new TaskItem(-1, "asdf", false, null)),
            () -> assertThrows(IllegalArgumentException.class, () -> new TaskItem(1, null, false, null)),
            () -> assertThrows(IllegalArgumentException.class, () -> new TaskItem(1, "     ", false, null))
        );
    }

    @Test
    void testForChangingCompletionField(){
        TaskItem taskItem = new TaskItem(1, "hello world", false, null);
        taskItem.markCompleted();
        assertTrue(taskItem.getCompleted());
    }
}