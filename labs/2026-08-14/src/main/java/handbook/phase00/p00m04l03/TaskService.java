package handbook.phase00.p00m04l03;

import java.util.List;

/**
 * TaskService
 */
public class TaskService {

    private final InMemoryRepository inMemoryRepository;

    public TaskService(InMemoryRepository inMemoryRepository){
        if(inMemoryRepository == null) throw new IllegalArgumentException("Repository required");
        this.inMemoryRepository = inMemoryRepository;
    }

    public TaskItem createTask(String description){
        if(description == null || description.trim().isEmpty()){
            throw new IllegalArgumentException("Description is required");
        }

        for(TaskItem t : inMemoryRepository.findAll()){
            if(t.getDescription().equalsIgnoreCase(description.trim())){
                throw new IllegalArgumentException("Task is already present with description");
            }
        }

        return inMemoryRepository.save(description);
    }

    public void completeTask(int id){
        TaskItem task = inMemoryRepository.findById(id);

        if(task == null){
            throw new IllegalArgumentException("Task not found with id : " + id);
        }

        task.markCompleted();
    }

    public boolean deleteTask(int id){
        return inMemoryRepository.deleted(id);
    }

    public List<TaskItem> getTasks(boolean onlyPending){
        List<TaskItem> allTasks = inMemoryRepository.findAll();

        if(onlyPending){
            return allTasks.stream().filter(t -> !t.isCompleted()).toList();
        }

        return allTasks; 

    }


}