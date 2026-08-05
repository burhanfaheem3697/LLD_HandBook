package unfamiliar.payment;

/**
 * CreditCardProcessor
 */
class CreditCardProcessor implements PaymentGateway {

    @Override
    public boolean process(double amount){
        if(amount <= 0.0){
            System.err.println("Payment failed amount should be greater than zero");
            return false;
        }
        System.out.println("Processing payment via credit card...");
        System.out.println("Successfully processed payment");
        return true;
    }
}