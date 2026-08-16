package com.example.OrderItem;


/**
 * OrderItemDebug
 */
public record OrderItemDebug(String productId, int quantity, double unitPrice) {
    public OrderItemDebug{
        if(productId == null || productId.isBlank()){
            throw new IllegalArgumentException("Product Id is required");
        }

        if(quantity <= 0){
            throw new IllegalArgumentException("Quantity must be positive");
        }

        if(unitPrice < 0.0){
            throw new IllegalArgumentException("Unit price can't be negative");
        }


    }

    public double getTotalPrice(){
        return quantity * unitPrice;
    }
}