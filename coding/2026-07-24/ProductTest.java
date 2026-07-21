import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * ProductTest
 */
public class ProductTest {

    @Test
    void testToVerifyAssertAllStatement(){
        Product p = new Product("Macbook",232.0,23);

        assertAll("Generating all the assertion error", 
        () -> assertEquals("Laptop",p.getName(),"Product name should be Laptop"),
        () -> assertEquals(999.0,p.getPrice(),"Product price should be 999.0"),
        () -> assertEquals(3,p.getStock(),"Product stock should be 3"));
    }
    
}