import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * OrderValidatorTest
 */
public class OrderValidatorTest {

    private OrderValidator validator;

    @BeforeEach
    void setup(){
        validator = new OrderValidator();
    }

    @Test
    void testForNullOrEmptyItemId(){
        assertThrows(IllegalArgumentException.class,() -> validator.validateOrder(null,23,3.3),"Should throw an exception for null item id");
        assertThrows(IllegalArgumentException.class,() -> validator.validateOrder("    ",32,30.3),"Should throw an exception for empty item id");
    }

    @Test
    void testForNegativeOrZeroQty(){
        assertThrows(IllegalArgumentException.class, () -> validator.validateOrder("1",0,43.3),"Should throw an exception for quantity equals zero");
        assertThrows(IllegalArgumentException.class, () -> validator.validateOrder("1",-1,43.3),"Should throw an exception for quantity negative");
    }

    @Test
    void testForNegativeOrZeroPrice(){
        assertThrows(IllegalArgumentException.class, () -> validator.validateOrder("2", 2, 0.0),"Should throw an exception for price equals zero");
        assertThrows(IllegalArgumentException.class, () -> validator.validateOrder("2", 2, -3.0),"Should throw an exception for price negative");
    }
}