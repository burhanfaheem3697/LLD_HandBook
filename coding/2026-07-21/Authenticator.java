
public class Authenticator {
    public static void main(String[] args) {
        try {
            login("", "admin123");
            throw new AssertionError("should throw illegal argument exception!");
        } catch (Exception e) {
            System.out.println("Caught the exception : " + e.getClass().getName() + " " + e.getMessage());
        }


    }

    private static void login(String username,String password) throws InvalidCredentialsException{
        if(username == null || username.trim().isEmpty() || password == null || password.trim().isEmpty()){
            throw new IllegalArgumentException("username or password can't be null or empty!");
        }


    }
}