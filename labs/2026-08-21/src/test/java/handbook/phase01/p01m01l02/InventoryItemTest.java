package handbook.phase01.p01m01l02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * InventoryItemTest
 */
public class InventoryItemTest {

    private InventoryItem item;

    @BeforeEach
    void setup(){
        item = new InventoryItem("SKU-9901", "Gaming Mouse", 10, 50, List.of("PERIPHERALS","LOGITECH"));
    }

    @Test
    void testRestockIncreasesQuantity(){
        item.restock(20);
        assertEquals(70, item.getAvailableQuantity());
    }

    @Test
    void testFulfillOrderDecreasesQuantity(){
        item.fulfillOrder(15);
        assertEquals(35, item.getAvailableQuantity());
    }

    @Test
    void testFulfillOrderBeyondStocksThrowsException(){
        assertThrows(IllegalStateException.class, () -> item.fulfillOrder(80));
    }

    @Test
    void testReorderNeededFlag(){
        assertFalse(item.isReorderNeeded());
        item.fulfillOrder(45);
        assertTrue(item.isReorderNeeded());
    }

    @Test
    void testSuppliersTagsCollectionEncapsulation(){
        List<String> tags = item.getSupplierTags();
        assertEquals(2, tags.size());

        assertThrows(UnsupportedOperationException.class, () -> tags.add("CHEAP"));
    }
}