import java.util.*;


public class TaskRepository {
    private final ArrayList<String> tasks;

    public TaskRepository(){
        tasks = new ArrayList<>();
    }

    public void addTask(String task){
        if(task == null || task.isEmpty()){
            throw new IllegalArgumentException("Task can't be null or empty!");
        }

        if(tasks.contains(task)){
            throw new IllegalArgumentException("Duplicate values are not allowed!");
        }

        tasks.add(task);
    }

    public ArrayList<String> findAll(){
        return new ArrayList<>(tasks);
    }

    public ArrayList<String> search(String query){
        ArrayList<String> list = new ArrayList<>();

        if(query == null || query.isEmpty()){
            return list;
        }

        String lowerQuery = query.toLowerCase().trim();

        for(String task : tasks){
            if(task.toLowerCase().contains(lowerQuery)){
                list.add(task);
            }
        }

        return list;
    }

}