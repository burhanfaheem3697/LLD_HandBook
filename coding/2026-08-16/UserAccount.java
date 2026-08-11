/**
 * UserAccount
 */
public class UserAccount {

    private String username;
    private boolean active;

    public UserAccount(String username){
        if(username == null || username.trim().isEmpty()){
            throw new IllegalArgumentException("Username is required");
        }

        this.username = username;
    }

    public String getUsername(){
        return username;
    }
}