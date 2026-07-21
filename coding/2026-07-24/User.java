/**
 * User
 */
public class User {

    private String username;

    public User(String username){
        if(username == null){
            throw new IllegalArgumentException("Username can't be null");
        }
        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }
}