import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * FaultyEntityDebug
 */
public class FaultyEntityDebug {

    private final String walletId;
    private double balance;

    public FaultyEntityDebug(String walletId, double balance){
        this.walletId = walletId;
        this.balance = balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }

        if(!(o instanceof FaultyEntityDebug)){
            return false;
        }

        FaultyEntityDebug that = (FaultyEntityDebug) o;

        return Objects.equals(this.walletId, that.walletId);
    }

    @Override
    public int hashCode(){
        return Objects.hash(walletId);
    }

    public static void main(String[] args){
        FaultyEntityDebug obj = new FaultyEntityDebug("1", 100.0);
        Set<FaultyEntityDebug> st = new HashSet<>();

        st.add(obj);

        obj.setBalance(500.0);

        System.out.println(st.contains(obj));
    }

}