import java.util.Objects;

/**
 * Money
 */
public class Money {

    private final double amount;
    private final String currency;

    public Money(double amount, String currency){
        if(amount < 0.0){
            throw new IllegalArgumentException("Money can't be negative");
        }

        if(currency == null || currency.trim().isEmpty()){
            throw new IllegalArgumentException("currency required");
        }

        this.amount = amount;
        this.currency = currency;
    }

    public Money add(Money other){
        if(!currency.equals(other.currency)){
            throw new IllegalArgumentException("Can't add different currencies");
        }

        return new Money(amount + other.amount, currency);
    }

    public double getAmount(){
        return amount;
    }

    public String getCurrency(){
        return currency;
    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }

        if(!(o instanceof Money)){
            return false;
        }

        Money other = (Money) o;

        return Double.compare(amount, other.amount) == 0 && Objects.equals(currency, other.currency);
    }

    @Override
    public int hashCode(){
        return Objects.hash(amount, currency);
    }
}