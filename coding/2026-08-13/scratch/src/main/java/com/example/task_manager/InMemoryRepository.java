package com.example.task_manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryRepository {

    private final Map<Integer,TaskItem> storage = new HashMap<>();
    private int idSequence = 1;

    public TaskItem save(String description){
        TaskItem taskItem = new TaskItem(idSequence++, description);
        storage.put(taskItem.getId(),taskItem);
        return taskItem;
    }

    public TaskItem findById(int id){
        TaskItem taskItem = storage.getOrDefault(id, null);
        return taskItem;
    }

    public List<TaskItem> findAll(){
        return new ArrayList<>(storage.values());
    }


}