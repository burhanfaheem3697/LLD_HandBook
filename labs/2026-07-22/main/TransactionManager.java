import java.sql.SQLException;

public class TransactionManager {
    public void runTransaction(DatabaseClient client,String query){
        if(client == null){
            throw new IllegalArgumentException("client can't be null");
        }

        try {
            client.execute(query);
        } catch (SQLException e) {
            throw new TransactionException("Transaction failed and aborted",e);
        } finally{
            client.close();
        }
    }
}