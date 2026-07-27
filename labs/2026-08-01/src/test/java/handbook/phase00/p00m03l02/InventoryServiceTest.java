package handbook.phase00.p00m03l02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * InventoryServiceTest
 */
public class InventoryServiceTest {

    private InventoryService service;

    @BeforeEach
    void setup(){
        service = new InventoryService();
    }

    @Test
    void testResourcePropertiesLoadedCorrectly(){
        assertEquals(500,service.getMaxCapacity());
    }

    @Test
    void testAddAndGetItemQuantity(){
        service.addItem("Widget", 50);
        assertEquals(50, service.getQuantity("Widget"));
    }

    @Test
    void testExceedingCapacityThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> service.addItem("HeavyBox", 600));
    }
    
}