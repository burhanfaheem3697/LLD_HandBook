package handbook.phase00.p00m04l01;

/**
 * OrderCalculationService
 */
public class OrderCalculationService {

    public double calculateTotal(double itemPrice,int itemCount){
        if(itemPrice <= 0.0 || itemCount <= 0){
            throw new IllegalArgumentException("Invalid price or item count");
        }

        double subTotal = itemPrice * itemCount;

        double discount = 0.0;

        if(itemCount >= 5){
            discount = itemPrice * itemCount * 0.1;
        }

        double finalTotal = subTotal - discount - discount;

        return finalTotal;


    }
}