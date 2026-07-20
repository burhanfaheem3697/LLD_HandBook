import java.sql.SQLException;

public class LabTestRunner {
    public static void main(String[] args) {
        System.out.println("Running resilient db simulation test...");

        TransactionManager manager = new TransactionManager();

        //test case 1 : successfull transaction and connection close
        DatabaseClient client1 = new DatabaseClient();
        manager.runTransaction(client1, "Select * from users;");
        assert !client1.connectionOpen : "Client remained open after transaction";
        System.out.println("Test case 1 passed");

        //test case 2 : Exception chaining and finally block release on failure
        DatabaseClient client2 = new DatabaseClient();
        boolean caughtTransactionException = false;
        try {
            manager.runTransaction(client2, "Insert into logs (types) values ('fail');");
        } catch (TransactionException e) {
            caughtTransactionException = true;
            assert e.getCause() instanceof SQLException : "Exception chain missing root cause!";
            System.out.println("Test case 2 passed");
            
        }

        assert caughtTransactionException : "Failed to intercept expected transaction exception!";
        assert !client2.connectionOpen : "Client remained open after query crash";
        System.out.println("Test case 2 finally passed");

        System.out.println("All database simulator lab test passed successfully");
    }
}