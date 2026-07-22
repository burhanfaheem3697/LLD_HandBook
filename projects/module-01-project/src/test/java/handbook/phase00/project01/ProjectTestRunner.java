package handbook.phase00.project01;
import java.util.ArrayList;


public class ProjectTestRunner {

    public static void main(String[] args){
        System.out.println("Starting project Integration Tests...");

        TaskRegistry registry = new TaskRegistry();
        SubSystemBootStrapper bootStrapper = new SubSystemBootStrapper(registry, "TESTING");

        bootStrapper.start();

        boolean caughtEmpty = false;
        try {
            registry.register("   ");
        } catch (Exception e) {
            caughtEmpty = true;
        }

        assert caughtEmpty : "Empty task registration didn't throw an error!";

        registry.register("Write system test");
        boolean caughtDuplicate = false;

        try {
            registry.register("WRITE SYSTEM TEST");
        } catch (Exception e) {
            caughtDuplicate = true;
        }

        assert caughtDuplicate : "Duplicate task registration didn't throw an error!";

        registry.register("Audit safety logs");

        ArrayList<String> queryResult = registry.query("safety");

        assert queryResult.size() == 1 : "Query failed to find search string!";
        assert queryResult.get(0).equals("Audit safety logs") : "Incorrect search result!";

        ArrayList<String> escapeList = registry.getRegisteredTasks();

        escapeList.clear();

        assert registry.getRegisteredTasks().size() == 2 : "Encapsulation breach: internal database corrupted!";

        System.out.println("All project integration tests passed cleanly!");

    }
}