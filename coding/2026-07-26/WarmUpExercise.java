/**
 * WarmUpExercise
 */
public class WarmUpExercise {

    public void setQuantity(int q){
        if(q == 0){
            throw new IllegalArgumentException("q can't be zero");
        }
    }
}