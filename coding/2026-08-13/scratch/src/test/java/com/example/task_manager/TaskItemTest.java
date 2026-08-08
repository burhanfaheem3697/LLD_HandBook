package com.example.task_manager;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
            () -> assertThrows(IllegalArgumentException.class, () -> new TaskItem(-1, "asdfsa")),
            () -> assertThrows(IllegalArgumentException.class, () -> new TaskItem(1, null)),
            () -> assertThrows(IllegalArgumentException.class, () -> new TaskItem(1, "    ")),
            () -> assertThrows(NullPointerException.class, () -> new TaskItem(1, "get ready with me",false,null))
        );
    }

    @Test
    void testForCompletion(){
        TaskItem taskItem = new TaskItem(1, "learn css");
        assertFalse(taskItem.isCompleted());
        taskItem.markCompleted();
        assertTrue(taskItem.isCompleted());
    }
}