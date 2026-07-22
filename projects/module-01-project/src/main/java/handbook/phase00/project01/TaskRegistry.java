package handbook.phase00.project01;
import java.util.ArrayList;

public class TaskRegistry {
    private final ArrayList<String> registry = new ArrayList<>();

    public void register(String task){
        if(task == null || task.trim().isEmpty()){
            throw new IllegalArgumentException("Task can't be null or empty");
        }

        String cleaned = task.trim();
        if(cleaned.length() < 3 || cleaned.length() > 50){
            throw new IllegalArgumentException("Task already registered: " + cleaned);
        }

        for(String t : registry){
            if(t.equalsIgnoreCase(cleaned)){
                throw new IllegalArgumentException("Task already registered");
            }
        }

        registry.add(cleaned);
    }

    public ArrayList<String> getRegisteredTasks(){
        return new ArrayList<>(this.registry);
    }

    public ArrayList<String> query(String filter){
        ArrayList<String> matches = new ArrayList<>();
        if(filter == null || filter.trim().isEmpty()){
            return matches;
        }

        String lowerFilter = filter.trim().toLowerCase();

        for(String t : registry){
            if(t.toLowerCase().contains(lowerFilter)){
                matches.add(t);
            }
        }

        return matches;

    }
}