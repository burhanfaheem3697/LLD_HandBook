package com.example.task_manager;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaskServiceDebugTest {

    private TaskServiceDebug taskServiceDebug;

    @BeforeEach
    void setup(){
        taskServiceDebug = new TaskServiceDebug();
    }

    @Test
    void testForCompleteTask(){
        TaskItem task = new TaskItem(1, "Test task");
        taskServiceDebug.completeTask(task);
        assertTrue(task.isCompleted());
        assertThrows(IllegalArgumentException.class, () -> taskServiceDebug.completeTask(null));
        assertThrows(IllegalStateException.class, () -> taskServiceDebug.completeTask(task));
    }
    
}