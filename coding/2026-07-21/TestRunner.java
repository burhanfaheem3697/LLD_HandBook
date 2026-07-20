
public class TestRunner {
   public static void main(String[] args) {
        DataProcessor dp = new DataProcessor();

        // Array of different inputs to test the exact same code execution block
        String[] testInputs = {null, "hello", "abcd", "123"};
        int[] testIndices = {9, -1, 0, 0};

        for (int i = 0; i < testInputs.length; i++) {
            System.out.println("--- Running Test Case " + (i + 1) + " ---");
            try {
                int result = dp.processData(testInputs[i], testIndices[i]);
                System.out.println("Success! Parsed Value: " + result);
                
            } catch (NullPointerException e) {
                System.out.println("Specific Catch: Handled missing input -> " + e.getMessage());
                
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Specific Catch: Bounds check error -> " + e.getMessage()); // Matches requirement
                
            } catch (NumberFormatException e) {
                System.out.println("Specific Catch: Number parse error -> " + e.getMessage()); // Matches requirement
                
            } catch (Exception e) {
                // The ultimate safety net. 
                // Must be at the bottom, or the compiler will throw an "unreachable code" error![cite: 1]
                System.out.println("Generic Catch: Handled an unexpected exception -> " + e.getMessage());
            }
        }
    }
}