import java.util.*;


public class IteratorPlayground {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();

        tasks.add("Review LLD handbook");
        tasks.add("Compile task bootstrapper");
        tasks.add("Draw UML and Sequence diagrams");


        try {
            for(String task : tasks){
                if(task.contains("handbook")){
                    tasks.remove(task);
                }
            }
        } catch (Exception e) {
            System.out.println("Here is the exception : " + e.getClass().getName());
            System.out.println("Here is the message : " + e.getMessage());
        }
    }
}