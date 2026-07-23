package handbook.phase00.project02;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * OrderProcessorTest
 */
public class OrderProcessorTest {
    private OrderProcessor processor;

    @BeforeEach
    void setup(){
        processor = new OrderProcessor();
    }

    @Test
    void testStandardOrderProcessing() throws InsufficientInventoryException{
        double total = processor.processOrder("ITEM-101",5,10.0);
        assertEquals(50.0,total,0.001);
    }

    @Test
    void testBulkOrderDiscountProcessing() throws InsufficientInventoryException{
        double total = processor.processOrder("ITEM-101",10,10.0);
        assertEquals(95.0,total,0.001);
    }

    @Test
    void testInvalidParameterPreconditions(){
        assertAll("Preconditions Guards",
            () -> assertThrows(IllegalArgumentException.class,() -> processor.processOrder(null,5,10.0)),
            () -> assertThrows(IllegalArgumentException.class,() -> processor.processOrder("ITEM-101",0,10.0)),
            () -> assertThrows(IllegalArgumentException.class,() -> processor.processOrder("ITEM-101",10,-3.5))
        );
    }

    @Test
    void testOutOfStockThrowsBusinessException(){
        assertThrows(InsufficientInventoryException.class,() -> processor.processOrder("OUT_OF_STOCK",10,30.0));
    }
    
}