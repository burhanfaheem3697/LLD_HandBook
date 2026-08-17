package handbook.phase01.project01.internal;

/**
 * Money
 */
public record Money(double amount, String currency) {

    public Money{
        if(amount < 0.0){
            throw new IllegalArgumentException("Amount can't be negative");
        }

        if(currency == null || currency.isBlank()){
            throw new IllegalArgumentException("Currency is required");
        }
    }

    public Money add(Money other){
        if(!currency.equals(other.currency)){
            throw new IllegalArgumentException("Currency Mismatch");
        }

        return new Money(amount + other.amount, currency);
    }
}