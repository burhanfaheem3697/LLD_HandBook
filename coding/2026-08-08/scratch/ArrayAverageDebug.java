
public class ArrayAverageDebug {
    public static void main(String[] args) {
        int[] data = {10,20,30,40};

        double avg = calculatAverage(data);

        System.out.println("Computed average: " + avg);
    }

    public static double calculatAverage(int[] nums){
        if(nums == null || nums.length == 0){
            return 0.0;
        }

        int sum = 0;
        
        for(int i=0;i<nums.length-1;i++){
            sum+=nums[i];
        }

        return (double)sum/nums.length;
    }
}