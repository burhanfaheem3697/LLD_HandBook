package com.example.task_manager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class InMemoryRepositoryTest {

    private InMemoryRepository inMemoryRepository;

    @BeforeEach
    void setup(){
        inMemoryRepository = new InMemoryRepository();
    }


    @Test
    void testForTaskCreation(){
        TaskItem task1 = inMemoryRepository.save("Task 1");
        TaskItem task2 = inMemoryRepository.save("Task 2");

        assertEquals(1, task1.getId());
        assertEquals(2, task2.getId());
    }

    @Test
    @Order(2)
    void testForTaskRetrieval(){
        TaskItem saved = inMemoryRepository.save("Test Task");
        TaskItem retrieved = inMemoryRepository.findById(saved.getId());

        assertNotNull(retrieved);
        assertEquals("Test Task", retrieved.getDescription());
    }

    @Test
    @Order(3)
    void testForAllTasksRetrieval(){
        inMemoryRepository.save("Task 1");
        inMemoryRepository.save("Task 2");

        List<TaskItem> tasks = inMemoryRepository.findAll();
        tasks.clear();

        assertNotNull(inMemoryRepository.findById(1));
        assertEquals(2, inMemoryRepository.findAll().size());
    }
}