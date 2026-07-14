import java.util.ArrayList;


public class TaskList {
    private final ArrayList<String> arr;

    public TaskList(){
        arr = new ArrayList<>();
    }

    public void addTask(String task){
        if(task == null || task.trim().isEmpty()){
            throw new IllegalArgumentException("task can't be null or empty");
        }

        if(arr.contains(task)){
            throw new IllegalArgumentException("duplicate tasks are not allowed : " + task);
        }
        arr.add(task);
    }

    public void removeTask(String task){
        arr.remove(task);
    }

    public String getTask(int index){
        return arr.get(index);
    }

    public int getSize(){
        return arr.size();
    }
}