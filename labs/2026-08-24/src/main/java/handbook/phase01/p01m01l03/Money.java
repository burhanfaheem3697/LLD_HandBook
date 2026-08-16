package handbook.phase01.p01m01l03;

import java.util.Objects;

/**
 * Money
 */
public final class Money {
    private final double amount;
    private final String currency;

    public Money(double amount, String currency){
        if(amount < 0.0 ){
            throw new IllegalArgumentException("Amount can't be negative");
        }

        if(currency == null || currency.isBlank()){
            throw new IllegalArgumentException("currency is required");
        }

        this.amount = amount;
        this.currency = currency.trim().toUpperCase();
    }

    public Money add(Money other){
        if(!currency.equals(other.currency)){
            throw new IllegalArgumentException("Currency mismatch");
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

        Money that = (Money) o;

        return Double.compare(this.amount, that.amount) == 0 && Objects.equals(this.currency, that.currency);
    }

    @Override
    public int hashCode(){
        return Objects.hash(amount, currency);
    }
    
}