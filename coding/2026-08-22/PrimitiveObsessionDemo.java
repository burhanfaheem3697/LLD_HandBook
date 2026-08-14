/**
 * PrimitiveObsessionDemo
 */
public class PrimitiveObsessionDemo {

    public static void processOrder(String email, double amount){
        System.out.println("Processing order for : " + email + " Amount : " + amount);
    }

    public static void main(String[] args){
        processOrder("invalid-email-string", -500.0);
    }
}