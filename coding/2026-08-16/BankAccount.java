import java.util.Objects;

/**
 * BankAccount
 */
public class BankAccount {
    private String accName;
    private double amount;

    public BankAccount(String accName, double amount){
        this.accName = accName;
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }
        
        if(!(o instanceof BankAccount)){
            return false;
        }

        BankAccount that = (BankAccount) o;

        return Double.compare(that.amount, amount) == 0 && Objects.equals(that.accName, accName);
    }

    @Override
    public int hashCode(){
        return Objects.hash(accName,amount);
    }
}