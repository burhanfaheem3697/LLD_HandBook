
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            triggerChecked();
        } catch (Exception e) {
            System.out.println("Caught the exception : " + e.getClass().getName());
            System.out.println("Here is the message : " + e.getMessage());
        }
        triggerUnchecked();
    }

    private static void triggerChecked() throws checkedException{
        System.out.println("I am inside checked exception method!!!");
    }

    private static void triggerUnchecked() throws uncheckedException{
        System.out.println("I am inside unchecked exception method!!!");
    }
}


class checkedException extends Exception{

}

class uncheckedException extends RuntimeException{

}