
public class Authenticator {
    public static void main(String[] args) {
        try {
            login("","admin123");
            throw new AssertionError("Test failed : guard clause didn't catch empty username!");
        } catch (Exception e) {
            System.out.println("Test case passed sucessfully!!!");
        }
    }

    private static void login(String username,String password) throws InvalidCredentialException{
        if(username == null || password == null || username.trim().isEmpty() || password.trim().isEmpty()){
            throw new IllegalArgumentException("Empty or null values are not allowed");
        }
    }
}