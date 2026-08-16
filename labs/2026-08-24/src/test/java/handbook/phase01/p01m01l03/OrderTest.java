package handbook.phase01.p01m01l03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * OrderTest
 */
public class OrderTest {

    private Order order;
    private Address address;
    private Money usd100;

    @BeforeEach
    void setUp(){
        address = new Address("123-Tech St", "95110", "San Jose");
        order = new Order("ORD-5001", address);
        usd100 = new Money(100.0, "USD");
    }

    @Test
    void testAddItemAndCalculateTotal(){
        order.addItem(new OrderItem("PROD-1", 2, usd100));
        order.addItem(new OrderItem("PROD-2", 1, usd100));
        Money total = order.calculateTotal();
        assertEquals(300.0, total.getAmount(), 0.001);
        assertEquals("USD", total.getCurrency());
    }

    @Test
    void testCancelOrderChangesStatus(){
        order.cancelOrder();
        assertEquals("CANCELLED", order.getStatus());
        assertThrows(IllegalStateException.class, () -> order.addItem(new OrderItem("PROD-1", 1, usd100)));
    }

    @Test
    void testItemsEncapsulation(){
        order.addItem(new OrderItem("PROD-1", 1, usd100));
        assertThrows(UnsupportedOperationException.class, () -> order.getItems().clear());
    }
}