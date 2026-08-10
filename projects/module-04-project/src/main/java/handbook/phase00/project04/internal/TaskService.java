package handbook.phase00.project04.internal;

import java.util.List;
import java.util.stream.Collectors;

/**
 * TaskService
 */
public class TaskService {

    private final InMemoryRepository repository = new InMemoryRepository();

    public Task addTask(String description){
        if(description == null || description.trim().isEmpty()){
            throw new IllegalArgumentException("Description is required");
        }

        for(Task t : repository.findAll()){
            if(t.getDescription().equalsIgnoreCase(description.trim())){
                throw new IllegalArgumentException("Task with description already exists");
            }
        }

        return repository.save(description);
    }

    public void completeTask(int id){
        Task task = repository.findById(id);
        if(task == null){
            throw new IllegalArgumentException("Task not found with id : " + id);
        }

        task.markCompleted();
    }

    public boolean deleteTask(int id){
        return repository.delete(id);
    }

    public List<Task> listTasks(boolean onlyPending){
        List<Task> all = repository.findAll();

        if(onlyPending){
            return all.stream().filter(t -> !t.isCompleted()).collect(Collectors.toList());
        }

        return all;
    }
}