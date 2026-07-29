package com.handbook.billing;

/**
 * PaymentProcessor
 */
public class PaymentProcessor {

    private final InvoiceCalculator invoiceCalculator = new InvoiceCalculator();

    public boolean process(double amount){

        if(amount <= 0){
            return false;
        }

        double tax = invoiceCalculator.calculateTax(amount);
        double totalAmount = amount + tax;

        System.out.println("Here is the total amount with tax : " + totalAmount);

        return true;
    }
}