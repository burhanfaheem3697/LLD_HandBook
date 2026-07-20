import java.sql.SQLException;

public class PropogationPlayground {
    public static void main(String[] args) {
        try {
            runTask();
        } catch (RuntimeException e) {
            System.out.println("Here is the stack trace : ");
            
            e.printStackTrace();
        }
    }

    private static void queryDatabase() throws SQLException{
        throw new SQLException("Simulated Database disk I/O failure");
    }

    private static void runTask(){
        try {
            queryDatabase();
        } catch (SQLException e) {
            throw new RuntimeException("DB query failed",e);
        }
    }
}