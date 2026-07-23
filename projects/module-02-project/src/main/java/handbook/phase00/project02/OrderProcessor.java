package handbook.phase00.project02;


/**
 * OrderProcessor
 */
public class OrderProcessor {
    public double processOrder(String itemId,int quantity,double price) throws InsufficientInventoryException{
        if(itemId == null || itemId.trim().isEmpty()){
            throw new IllegalArgumentException("Item id is required.");
        }

        if(quantity <= 0){
            throw new IllegalArgumentException("Quantity must be greater than zero.");
        }

        if(price <= 0.0){
            throw new IllegalArgumentException("Price must be positive.");
        }

        if(itemId.trim().equalsIgnoreCase("OUT_OF_STOCK")){
            throw new InsufficientInventoryException("Item " + itemId + " is out of stock");
        }

        double subTotal = quantity * price;

        if(quantity >= 10){
            return subTotal * 0.95;
        }

        return subTotal;
    }
    
}