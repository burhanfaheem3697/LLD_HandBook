package handbook.phase01.p01m01l02;

import java.util.List;

/**
 * InventoryItem
 */
public class InventoryItem {

    private final String sku;
    private final String name;
    private final int reorderThreshold;
    private int availableQuantity;
    private final List<String> supplierTags;

    public InventoryItem(String sku, String name, int reorderThreshold, int initialQuantity, List<String> supplierTags){
        if(sku == null || sku.trim().isEmpty()){
            throw new IllegalArgumentException("SKU is required");
        }

        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name is required");
        }

        if(initialQuantity < 0){
            throw new IllegalArgumentException("Initial capacity can't be negative");
        }

        if(reorderThreshold <= 0){
            throw new IllegalArgumentException("Reorder threshold must be positive");
        }

        this.sku = sku.trim().toUpperCase();
        this.name = name.trim();
        this.reorderThreshold = reorderThreshold;
        this.availableQuantity = initialQuantity;
        this.supplierTags = supplierTags != null ? List.copyOf(supplierTags) : List.of();
    }
    
    public void restock(int quantity){
        if(quantity <= 0){
            throw new IllegalArgumentException("Order quantity must be positve");
        }
        availableQuantity+=quantity;
    }

    public void fulfillOrder(int quantity){
        if(quantity <= 0){
            throw new IllegalArgumentException("Order quality must be positive");
        }

        if(quantity > availableQuantity){
            throw new IllegalStateException("Insufficient stock: Order fulfillment prevented");
        }

        availableQuantity-=quantity;


    }

    public boolean isReorderNeeded(){
        return availableQuantity <= reorderThreshold;
    }

    public String getSku(){
        return sku;
    }

    public String getName(){
        return name;
    }

    public int getAvailableQuantity(){
        return availableQuantity;
    }

    public int getReorderThreshold(){
        return reorderThreshold;
    }

    public List<String> getSupplierTags(){
        return List.copyOf(supplierTags);
    }



    
}