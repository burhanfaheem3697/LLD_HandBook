package unfamiliar.payment;


public interface PaymentGateway{
    boolean process(double amount);
}