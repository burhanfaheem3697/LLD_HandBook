import java.sql.SQLException;

public class DatabaseClient {
    public boolean connectionOpen = true;

    public void execute(String query) throws SQLException{
        if(!connectionOpen){
            throw new IllegalStateException("Connection is closed!");
        }

        if(query != null && query.toLowerCase().contains("fail")){
            throw new SQLException("Simulated disk I/O failure");
        }

        System.out.println("Query executed successfully");
    }

    public void close(){
        this.connectionOpen = false;
        System.out.println("Connection closed successfully");
    }
}