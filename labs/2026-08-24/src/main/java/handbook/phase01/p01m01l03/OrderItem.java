package handbook.phase01.p01m01l03;

/**
 * OrderItem
 */
public record OrderItem(String productId, int quantity, Money unitPrice) {
    public OrderItem{
        if(productId == null || productId.isBlank()){
            throw new IllegalArgumentException("Product Id is required");
        }

        if(quantity <= 0){
            throw new IllegalArgumentException("Quantity must be positive");
        }

        if(unitPrice == null){
            throw new IllegalArgumentException("Unit Price is required");
        }
    }

    public Money getTotalPrice(){
        return new Money(unitPrice.getAmount() * quantity, unitPrice.getCurrency());
    }
}