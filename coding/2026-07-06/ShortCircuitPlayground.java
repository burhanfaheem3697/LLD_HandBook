
public class ShortCircuitPlayground {
    public static void main(String[] args) {
        try {
            String str = null;

            System.out.println("here is the output by the method : " + checkString(str));
            
        } catch (NullPointerException e) {

            System.out.println("Trying to access method over null!!! " + e.getMessage());
        }

        try {

            String str = null;

            System.out.println("here is the output by the fixed method : " + checkStringFixed(str));
            
        } catch (NullPointerException e) {
            System.out.println("Trying to access method over null!!! " + e.getMessage());
        }
    }

    private static boolean checkString(String str){
        if(str != null & str.length() > 10){
            return false;
        }

        return true;
    }

    private static boolean checkStringFixed(String str){
        if(str != null && str.length() > 10){
            return false;
        }

        return true;
    }
}