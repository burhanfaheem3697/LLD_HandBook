import java.util.Objects;

public class Money{
    private final double amount;
    private final String currency;

    public Money(double amount, String currency){
        if(amount < 0.0){
            throw new IllegalArgumentException("Amount can't be negative");
        }

        if(currency == null || currency.trim().isEmpty()){
            throw new IllegalArgumentException("currency is required");
        }

        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount(){
        return amount;
    }

    public String getCurrency(){
        return currency;
    }

    public Money add(Money other){
        if(!currency.equals(other.currency)){
            throw new IllegalArgumentException("Can't add different currencies");
        }

        return new Money(amount + other.amount, currency);
    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }

        if(!(o instanceof Object)){
            return false;
        }

        Money that = (Money) o;

        return Double.compare(this.amount,that.amount) == 0 && Objects.equals(this.currency,that.currency);
    }

    @Override
    public int hashCode(){
        return Objects.hash(amount, currency);
    }
}