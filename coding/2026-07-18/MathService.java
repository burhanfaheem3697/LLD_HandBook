
public class MathService {
    double calculateAverage(int[] values){
        if(values == null){
            throw new IllegalArgumentException("the array can't be null");
        }

        double sum = 0;
        int n = values.length;
        for(int i=0;i<n;i++){
            sum+=values[i];
        }

        return sum/n;
    }

    double calculateAverage(double[] values){
        if(values == null){
            throw new IllegalArgumentException("the array can't be null");
        }

        double sum = 0;
        int n = values.length;
        for(int i=0;i<n;i++){
            sum+=values[i];
        }

        return sum/n;
    }
}