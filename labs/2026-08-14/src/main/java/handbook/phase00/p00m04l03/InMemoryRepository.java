package handbook.phase00.p00m04l03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryRepository {

    private Map<Integer,TaskItem> storage = new HashMap<>();
    private int idSequence = 1;

    public TaskItem save(String description){
        TaskItem newTask = new TaskItem(idSequence++, description);
        storage.put(newTask.getId(),newTask);
        return newTask;
    }

    public TaskItem findById(int id){
        return storage.get(id);
    }

    public List<TaskItem> findAll(){
        return new ArrayList<>(storage.values());
    }

    public boolean deleted(int id){
        return storage.remove(id) != null;
    }
    
}