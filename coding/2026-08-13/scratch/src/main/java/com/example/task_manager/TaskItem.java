package com.example.task_manager;

import java.time.LocalDateTime;
import java.util.Objects;

public class TaskItem {

    private int id;
    private String description;
    private boolean completed;
    private LocalDateTime createdAt;

    public TaskItem(int id, String description){
        this(id,description,false,LocalDateTime.now());
    }


    public TaskItem(int id, String description, boolean completed, LocalDateTime createdAt){
        if(id <= 0){
            throw new IllegalArgumentException("Id must be positive");
        }

        if(description == null || description.trim().isEmpty()){
            throw new IllegalArgumentException("description is required");
        }

        this.id = id;
        this.description = description;
        this.completed = completed;
        this.createdAt = Objects.requireNonNull(createdAt, "createdAt cannot be null");
    }

    public void markCompleted(){
        completed = true;
    }

    public boolean isCompleted(){
        return completed;
    }

    public int getId(){
        return id;
    }
    public String getDescription(){
        return description;
    }


}