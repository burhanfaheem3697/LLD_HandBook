package com.example.task_tracker;


import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TaskTrackerFacadeTest {


    @Test
    void testForNullRepository(){
        assertThrows(IllegalArgumentException.class, () -> new TaskTrackerFacade(null));
    }

    @Test
    void testForEmptyTaskDescription(){
        TaskTrackerFacade taskTrackerFacade = new TaskTrackerFacade(new TaskRepository());
        assertThrows(IllegalArgumentException.class, () -> taskTrackerFacade.createTask("    "));
    }
    
}