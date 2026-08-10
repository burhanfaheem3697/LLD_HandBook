package handbook.phase00.project04.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * InMemoryRepository
 */
class InMemoryRepository {
    private final Map<Integer,Task> storage = new HashMap<>();
    private int idSequence = 1;

    Task save(String description){
        Task newTask = new Task(idSequence++, description);
        storage.put(newTask.getId(),newTask);
        return newTask;
    }

    Task findById(int id){
        return storage.get(id);
    }

    boolean delete(int id){
        return storage.remove(id) != null;
    }

    List<Task> findAll(){
        return new ArrayList<>(storage.values());
    }
}