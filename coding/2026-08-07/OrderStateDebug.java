
public class OrderStateDebug {
    private String status = "PENDING";

    public void step1(){

    }

    public void step2(){
        status = "CORRUPTED";
    }

    public void step3(){

    }
    public static void main(String[] args) {
        OrderStateDebug order = new OrderStateDebug();
        order.step1();
        order.step2();
        order.step3();
        OrderStateDebug order2 = new OrderStateDebug();
        System.out.println("Final status: " + order.status);
    }
}