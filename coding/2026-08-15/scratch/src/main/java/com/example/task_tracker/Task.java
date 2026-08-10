package com.example.task_tracker;

import java.time.LocalDateTime;

/**
 * Task
 */
class Task {

    private int id;
    private String description;
    private boolean completed;
    private LocalDateTime createdAt;


    Task(int id,String description){
        if(id <= 0) throw new IllegalArgumentException("Id must be positive");
        if(description == null || description.trim().isEmpty()){
            throw new IllegalArgumentException("Description is required");
        }

        this.id = id;
        this.description = description;
        this.completed = false;
        this.createdAt = LocalDateTime.now();
    }

    int getId(){
        return id;
    }

    String getDescription(){
        return description;
    }

    LocalDateTime getCreatedAt(){
        return createdAt;
    }

    void markCompleted(){
        if(completed == true){
            throw new IllegalStateException("Task is already completed");
        }

        completed = true;
    }

    boolean isCompleted(){
        return completed;
    }
}