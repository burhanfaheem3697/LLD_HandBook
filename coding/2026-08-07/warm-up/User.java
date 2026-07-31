
public class User {
    public static void main(String[] args) {
        String[] roles = new String[]{"STUDENT","TEACHER","ADMIN"};
        int i = 5;

        for(String role : roles){
            UserData user = new UserData(role);

            System.out.println(user.getRole());
        }
        
    }
}

class UserData{
    private String role;

    UserData(String role){
        this.role = role;
    }

    String getRole(){
        return role;
    }
}