/**
 * OrderValidator
 */
public class OrderValidator {

    public void validateOrder(String itemId,int qty,double price){
        if(itemId == null || itemId.trim().isEmpty()){
            throw new IllegalArgumentException("the item id can't be null or empty");
        }

        if(qty <= 0){
            throw new IllegalArgumentException("the quantity can't be negative or equals to zero");
        }

        if(price <= 0.0){
            throw new IllegalArgumentException("the price can't be negative or equals to zero");
        }
    }


}