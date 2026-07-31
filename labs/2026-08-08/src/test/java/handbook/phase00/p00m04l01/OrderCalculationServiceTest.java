package handbook.phase00.p00m04l01;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * OrderCalculationServiceTest
 */
public class OrderCalculationServiceTest {

    private OrderCalculationService service;

    @BeforeEach
    void setup(){
        service = new OrderCalculationService();
    }

    @Test
    void testStandardOrderCalculation(){
        assertEquals(20.0, service.calculateTotal(10.0, 2),0.001);
    }

    @Test
    void testBulkOrderDiscountCalculation(){
        assertEquals(45.0, service.calculateTotal(10.0, 5),0.001);
    }

    @Test
    void testInvalidInputThrowsException(){
        assertAll("Precondition Errors",
            () -> assertThrows(IllegalArgumentException.class, () -> service.calculateTotal(0.0, 3)),
            () -> assertThrows(IllegalArgumentException.class,() -> service.calculateTotal(5.0, 0))
        );
    }


}