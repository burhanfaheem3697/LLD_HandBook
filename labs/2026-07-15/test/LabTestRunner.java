import java.util.*;


public class LabTestRunner {
    public static void main(String[] args) {
        TaskRepository repo = new TaskRepository();


        repo.addTask("Review LLD Handbook");
        repo.addTask("Compile Task Bootstrapper");
        repo.addTask("Draw UML and Sequence Diagrams");

        //test case 1 
        ArrayList<String> list = repo.search("boot");

        assert list.size() == 1 : "Search failed to filter matching tasks!";
        assert list.get(0).equals("Compile Task Bootstrapper") : "Incorrect search result returned!";
        System.out.println("test case 1 passed : search filter correct");

        //test case 2
        ArrayList<String> allTasks = repo.findAll();

        allTasks.clear();

        assert repo.findAll().size() == 3 : "Security leak : External modification affected internal database!";
        System.out.println("test case 2 passed : encapsulation remains secure");


        System.out.println("All test cases passed successfully!");
    }
}