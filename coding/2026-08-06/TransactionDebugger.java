/**
 * TransactionDebugger
 */
public class TransactionDebugger {

    public static void main(String[] args){

        double[] transactions = { 45.0, 120.5, 12.0, 999.0, 50.0, 1500.0, 30.0 };
        double balance = 1000.0;
        for (double tx : transactions) {
            balance += tx; // SET CONDITIONAL BREAKPOINT HERE!
        }
    }
}