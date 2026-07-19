
public class EquationRunnerTester {
    public static void main(String[] args) {
        EquationRunner runner = new EquationRunner();

        double linearResult = runner.solveLinear(2.0, 5.0, 1.0);

        assert linearResult == 11.0 : "Linear result is incorrect";

        System.out.println("Test case 1 : passed successfully!");

        double quadraticResult = runner.solveQuardratic(2.0,3.0,3.5,1.0);

        assert quadraticResult == 8.5 : "Quadratic result is incorrect";

        System.out.println("Test case 2 : passed successfully!");

        boolean caughtBoundError = false;

        try {
            runner.solveLinear(0.0, 1.0,2.0);
        } catch (IllegalArgumentException e) {
            caughtBoundError = true;
            System.out.println("Exception caugt for bound error : " + e.getClass().getName());
            System.out.println("Exception message : " + e.getMessage());
            System.out.println("Test case 3 : passed successfully!");
        }

        assert caughtBoundError : "Should throw exception for m equals zero";

        System.out.println("All test cases passed successfully!!!");
    }
}