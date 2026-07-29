package com.handbook.billing;

/**
 * InvoiceCalculator
 */
class InvoiceCalculator {

    private final TaxRateProvider taxRateProvider = new TaxRateProvider();



    double calculateTax(double amount){
      
        return taxRateProvider.getRate() * amount;
    }
}