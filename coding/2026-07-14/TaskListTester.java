
public class TaskListTester {
    public static void main(String[] args) {
        TaskList tasklist = new TaskList();

        //valid add test
        tasklist.addTask("Hello world!!!");
        assert tasklist.getSize() == 1 : "Size should be equal to one";

        //invariant test : reject null
        boolean threwNull = false;
        try {
            tasklist.addTask(null);
        } catch (IllegalArgumentException e) {
           threwNull = true;
        }

        assert threwNull : "Should throw illegal argument exception for null values!";

        boolean threwEmpty = false;
        try {
            tasklist.addTask("");
        } catch (Exception e) {
            threwEmpty = true;
        }

        assert threwEmpty : "Should throw illegal arguement exception for empty tasks!";

        boolean threwDuplicate = false;
        try {
            tasklist.addTask("Hello world!!!");
        } catch (Exception e) {
            threwDuplicate = true;
        }

        assert threwDuplicate : "Should throw illegal arguement exception for duplicate values!";

        System.out.println("All structural invariant test cases passed successfully!!!");


    }
}