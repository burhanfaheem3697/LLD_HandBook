package com.example.task_tracker;

/**
 * TaskTrackerFacade
 */
public class TaskTrackerFacade {

    private final TaskRepository repository;

    public TaskTrackerFacade(TaskRepository repository){
        if(repository == null){
            throw new IllegalArgumentException("Repository is required");
        }
        this.repository = repository;
    }

    public Task createTask(String description){
        if(description == null || description.trim().isEmpty()){
            throw new IllegalArgumentException("Description is required");
        }

        Task savedTask = repository.create(description);

        return savedTask;
    }
}