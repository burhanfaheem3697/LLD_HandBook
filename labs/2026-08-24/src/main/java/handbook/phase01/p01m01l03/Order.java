package handbook.phase01.p01m01l03;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Order
 */
public class Order {

    private final Address shippingAddress;
    private final String orderId;
    private String status = "CREATED";
    private List<OrderItem> items = new ArrayList<>();

    public Order(String orderId, Address shippingAddress){
        if(orderId == null || orderId.isBlank()){
            throw new IllegalArgumentException("Order Id is required");
        }

        if(shippingAddress == null){
            throw new IllegalArgumentException("Shipping address is required");
        }

        this.orderId = orderId;
        this.shippingAddress = shippingAddress;
    }

    public void addItem(OrderItem item){
        if(!"CREATED".equals(status)){
            throw new IllegalStateException("Can't add item to order in status: " + status);
        }

        if(item == null){
            throw new IllegalArgumentException("Item is required");
        }

        items.add(item);
    }

    public Money calculateTotal(){
        if(items.isEmpty()){
            return new Money(0.0, "USD");
        }
        String currency = items.get(0).unitPrice().getCurrency();
        Money total = new Money(0.0, currency);
        for(OrderItem item : items){
            total = total.add(item.getTotalPrice());
        }

        return total;
    }

    public void cancelOrder(){
        if("CANCELLED".equals(status)){
            throw new IllegalArgumentException("Order is already cancelled");
        }

        status = "CANCELLED";
    }

    public String getOrderId(){
        return orderId;
    }

    public Address getShippingAddress(){
        return shippingAddress;
    }

    public String getStatus(){
        return status;
    }

    public List<OrderItem> getItems(){
        return List.copyOf(items);
    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }

        if(!(o instanceof Order)){
            return false;
        }

        Order that = (Order) o;

        return Objects.equals(this.orderId, that.orderId);
    }

    @Override
    public int hashCode(){
        return Objects.hash(orderId);
    }
}