

public class LabTestRunner {
    public static void main(String[] args) {
        System.out.println("Running transactions engine lab tests...");

        Account account = new Account(100.0);

        TransactionEngine engine = new TransactionEngine();

        boolean caughtOverdraft = false;
        try {
            engine.process(account, TransactionEngine.TxnType.WITHDRAW, 150.0);
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
            caughtOverdraft = true;
            System.out.println("Test case 1 passed : Overdraft caught.");

        }
        assert caughtOverdraft : "Overdraft failed to trigger exception!";

        boolean caughtNegative = false;
        try {
            engine.process(account, TransactionEngine.TxnType.DEPOSIT, -50);
        } catch (IllegalArgumentException e) {
            // TODO: handle exception
            caughtNegative = true;
            System.out.println("Test case 2 passed : Negative check caught");
        }

        assert caughtNegative : "Negative checks failed to trigger exception!";

        Account richAccount = new Account(Double.MAX_VALUE - 10);

        boolean caughtOverflow = false;

        try {
            engine.process(richAccount, TransactionEngine.TxnType.DEPOSIT, 20.0);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            caughtOverflow = true;
            System.out.println("Test case 3 passed : Double overflow caught");
        }

        assert caughtOverflow : "Overflow checks failed to trigger exception!";

        System.out.println("All transactio engine lab tests completed successfully!");
    }
}