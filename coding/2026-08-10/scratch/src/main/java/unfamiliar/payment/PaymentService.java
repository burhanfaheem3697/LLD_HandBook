package unfamiliar.payment;

/**
 * PaymentService
 */
public class PaymentService {

    private PaymentGateway gateway;

    public PaymentService(PaymentGateway gateway){
        this.gateway = gateway;
    }

    public boolean executeOrderPayment(double amount){
        System.out.println("Initiating order payment sequence");
        return gateway.process(amount);
    }
}