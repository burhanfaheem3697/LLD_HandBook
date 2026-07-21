/**
 * User
 */
public class User {
    private String username;

    public User(String username){
        if(username == null || username.trim().length() < 3){
            throw new IllegalArgumentException("Username must be at least 3 characters.");
        }
        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }
}