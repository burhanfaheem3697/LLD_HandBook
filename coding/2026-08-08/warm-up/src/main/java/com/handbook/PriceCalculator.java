package com.handbook;

/**
 * PriceCalculator
 */
class PriceCalculator {

    private final double discountRate = 0.1;

    double calculatePrice(double itemPrice,double quantity){
        double discountPrice = itemPrice * quantity * discountRate;
        double totalPrice = itemPrice * quantity;
        return totalPrice - discountPrice;
    }
    
}