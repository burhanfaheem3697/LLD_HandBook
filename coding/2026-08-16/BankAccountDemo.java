/**
 * BankAccountDemo
 */
public class BankAccountDemo {

    public static void main(String[] args){
        BankAccount acc1 = new BankAccount("ACC-1", 500.0);
        BankAccount acc2 = new BankAccount("ACC-1", 500.0);


        System.out.println("Comparing two accounts : " + (acc1 == acc2));

        System.out.println("Comparing two accounts : " + acc1.equals(acc2));
    }
}