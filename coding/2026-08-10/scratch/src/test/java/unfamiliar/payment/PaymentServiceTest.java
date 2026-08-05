package unfamiliar.payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * PaymentServiceTest
 */
public class PaymentServiceTest {
    private PaymentGateway gateway;
    private PaymentService service;

    @BeforeEach
    void setup(){
        gateway = new CreditCardProcessor();
        service = new PaymentService(gateway);

    }

    @Test
    void testPaymentSuccess(){
        boolean result = service.executeOrderPayment(150.0);
        assertTrue(result,"Expected payment execution to succeed for positive amount");
    }

    @Test
    void testPaymentFailureInvalidAmount(){
        boolean result = service.executeOrderPayment(-50.0);
        assertFalse(result,"Expected payment failure for invalid amount");
    }
}