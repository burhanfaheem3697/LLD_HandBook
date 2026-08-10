package handbook.phase00.project04.internal;

/**
 * Task
 */
public class Task {

    private int id;
    private String description;
    private boolean completed;

    public Task(int id, String description){
        if(id <= 0) throw new IllegalArgumentException("Id must be positive");
        if(description == null || description.trim().isEmpty()){
            throw new IllegalArgumentException("Description is required");
        }
        this.id = id;
        this.description = description;
        this.completed = false;
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

    
}