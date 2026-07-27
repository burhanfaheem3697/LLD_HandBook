package handbook.phase00.p00m03l02;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * InventoryService
 */
public class InventoryService {

    private int maxCapacity = 500;
    private final Map<String,Integer> stock = new HashMap<>();

    public InventoryService(){
        loadDefaults();
    }

    private void loadDefaults(){
        try(InputStream is = getClass().getClassLoader().getResourceAsStream("inventory-defaults.properties")){
            if(is != null){
                Properties props = new Properties();
                props.load(is);
                this.maxCapacity = Integer.parseInt(props.getProperty("default.max_capacity","500"));
            }
        } catch(Exception e){
            System.err.println("Warning: Failed to load inventory-defaults.properties, using fallback limit");
        }
    }

    public void addItem(String item, int quantity){
        if(item == null || item.trim().isEmpty()){
            throw new IllegalArgumentException("Item name required");
        }

        if(quantity <= 0){
            throw new IllegalArgumentException("Quantity must be positive");
        }

        int currentTotal = stock.values().stream().mapToInt(Integer::intValue).sum();
        if(currentTotal + quantity > maxCapacity){
            throw new IllegalArgumentException("Adding item exceeds maximum warehouse capacity of " + maxCapacity);
        }

        stock.put(item.trim().toLowerCase(),stock.getOrDefault(item.trim().toLowerCase(), 0) + quantity);
    }

    public int getQuantity(String item){
        if(item == null) return 0;
        return stock.getOrDefault(item.trim().toLowerCase(),0);
    }

    public int getMaxCapacity(){
        return maxCapacity;
    }
}