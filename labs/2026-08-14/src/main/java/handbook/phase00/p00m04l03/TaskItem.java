package handbook.phase00.p00m04l03;

import java.time.LocalDateTime;


public class TaskItem {

    private int id;
    private String description;
    private boolean completed;
    private LocalDateTime createdAt;

    public TaskItem(int id, String description){
        if(id <= 0){
            throw new IllegalArgumentException("Id must be positive");
        }

        if(description == null || description.trim().isEmpty()){
            throw new IllegalArgumentException("Description is required");
        }

        this.id = id;
        this.description = description;
        this.completed = false;
        this.createdAt = LocalDateTime.now();
    }

    public int getId(){
        return id;
    }

    public String getDescription(){
        return description;
    }

    public void markCompleted(){
        if(completed == true){
            throw new IllegalStateException("Task is already completed");
        }

        completed = true;
    }

    public boolean isCompleted(){
        return completed;
    }

    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    
}