package com.example.task_tracker;

import java.util.HashMap;
import java.util.Map;

/**
 * TaskRepository
 */
class TaskRepository {
    private final Map<Integer,Task> storage = new HashMap<>();
    private int idSequence = 1;

    Task create(String description){
        Task newTask = new Task(idSequence++,description);
        storage.put(newTask.getId(),newTask);
        return newTask;
    }
}