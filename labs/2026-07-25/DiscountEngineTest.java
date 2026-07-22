import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * DiscountEngineTest
 */
public class DiscountEngineTest {

    private DiscountEngine engine;

    @BeforeEach
    void setup(){
        engine = new DiscountEngine();
    }

    @Test
    void testStandardTierDiscount(){
        assertAll("Standard Tier Verification",
            () -> assertEquals(0.0,engine.calculateDiscount(45, "STANDARD"),"Discount should be 0% of orderTotal"),
            () -> assertEquals(7.5,engine.calculateDiscount(150, "STANDARD"),"Discount should be 5% of orderTotal")
        );
    }

    @Test
    void testVipTierDiscount(){
        assertAll("VIP Tier Verification",
            () -> assertEquals(9.5,engine.calculateDiscount(95, "VIP"),"Discount should be 10% of orderTotal"),
            () -> assertEquals(45.0,engine.calculateDiscount(225,"VIP"),"Discount should be 20% of orderTotal")
        );
    }

    @Test
    void testNegativeOrderTotal(){
        assertThrows("Should throw exception for negative order total",IllegalArgumentException.class, () -> engine.calculateDiscount(-1.0, "VIP"));
    }

    @Test
    void testNullTier(){
        assertThrows("Should throw exception for null tier",IllegalArgumentException.class,() -> engine.calculateDiscount(32.0, null));
    }

    @Test
    void testInvalidTier(){
        assertThrows("Should throw exception for invalid tier",IllegalArgumentException.class,() -> engine.calculateDiscount(23.0, "asdb"));
    }
}