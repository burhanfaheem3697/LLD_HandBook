package com.example.task;

import java.time.LocalDateTime;

/**
 * TaskItem
 */
class TaskItem {

    private final int id;
    private String description;
    private boolean completed;
    private final LocalDateTime createdAt;

    TaskItem(int id, String description, boolean completed, LocalDateTime createdAt){
        if(id <= 0){
            throw new IllegalArgumentException("Id must be positive");
        }
        if(description == null || description.trim().isEmpty()){
            throw new IllegalArgumentException("description is required");
        }

        this.id = id;
        this.description = description;
        this.completed = completed;
        this.createdAt = createdAt;
    }

    void markCompleted(){
        completed = true;
    }

    boolean getCompleted(){
        return completed;
    }
}