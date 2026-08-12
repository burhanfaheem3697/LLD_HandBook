import java.util.Objects;

/**
 * OverrideEqualAndHashCode
 */
public class OverrideEqualAndHashCode {

    private String accNumber;
    private double amount;

    @Override
    public boolean equals(Object o){
        if(o == this) return true;
        if(!(o instanceof OverrideEqualAndHashCode)){
            return false;
        }

        OverrideEqualAndHashCode that = (OverrideEqualAndHashCode) o;

        return Double.compare(that.amount, amount) == 0 && Objects.equals(that.accNumber,accNumber);
    }

    @Override
    public int hashCode(){
        return Objects.hash(accNumber,amount);
    }
}