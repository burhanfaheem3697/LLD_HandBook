import java.util.*;

public class ConfigRegistry {
    private final Map<String,String> settings;

    public ConfigRegistry(){
        settings = new HashMap<>();
    }

    public void set(String key,String value){
        if(key == null || key.trim().isEmpty()){
            throw new IllegalArgumentException("Key can't be null or empty!");
        }

        if(value == null){
            throw new IllegalArgumentException("Value can't be null!");
        }

        settings.put(key.trim().toLowerCase(),value);
    }

    public String get(String key){
        if(key == null || key.trim().isEmpty()){
            throw new IllegalArgumentException("Key can't be null or empty!");
        }

        return settings.get(key.trim().toLowerCase());
    }

    public boolean containsKey(String key){
        if(key == null || key.trim().isEmpty()){
            return false;
        }

        return settings.containsKey(key.trim().toLowerCase());
    }

    public int getSize(){
        return settings.size();
    }
    
}