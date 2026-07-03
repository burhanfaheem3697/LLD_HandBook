package handbook.phase00.l01;

public class LabTestRunner {
    public static void main(String[] args){
        ConfigLoader loader = new ConfigLoader();
        BootStrapper app = new BootStrapper(loader);

        boolean exceptionThrown = false;
        try{
            app.boot();
        } catch(IllegalArgumentException e){
            exceptionThrown = true;
            System.out.println("Test Case 1 Passed: Caught expected missing config exception.");
        }

        assert exceptionThrown : "Invariant validation failed to throw IllegalArgumentException!";

        loader.setConfig("environment","DEVELOPMENT");
        app.boot();
        System.out.println("Test Case 2 Passed: Booted successfully.");

        System.out.println("All Lab Tests Completed Successfully!");



    }
}
