
public class MathServiceTester {
    public static void main(String[] args) {
        MathService ms = new MathService();

        //test case 1 : check for null value for int array
        int[] arr = new int[7];
        arr = null;
        boolean isNull = false;

        try {
            ms.calculateAverage(arr);
        } catch (IllegalArgumentException e) {
            isNull = true;
            System.out.println("Exception catched for test case 1 : " + e.getClass().getName());
            System.out.println("Exception message for test case 1 : " + e.getMessage());
        }

        assert isNull : "Should check for null value for int array";

        //test case 2 : check for null value for double array
        double[] newArray = new double[7];
        newArray = null;
        isNull = false;

        try {
            ms.calculateAverage(newArray);
        } catch (IllegalArgumentException e) {
            isNull = true;
            System.out.println("Exception catched for test case 2 : " + e.getClass().getName());
            System.out.println("Exception message for test case 2 : " + e.getMessage());
        }

        assert isNull : "Should check for null value for double array";

        System.out.println("All test case passed successfully!");

        System.out.println(ms.calculateAverage(new int[]{3,4,7,7,4,2}));
        System.out.println(ms.calculateAverage(new double[]{3.0,5.34,9.09,10.83}));

    }
}