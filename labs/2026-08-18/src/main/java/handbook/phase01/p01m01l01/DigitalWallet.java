package handbook.phase01.p01m01l01;

import java.util.Objects;

/**
 * DigitalWallet
 */
public class DigitalWallet {

    private final String walletId;
    private final String currency;
    private double balance;

    public DigitalWallet(String walletId, String currency, double balance){
        if(walletId == null || walletId.trim().isEmpty()){
            throw new IllegalArgumentException("Wallet Id is required");
        }

        if(currency == null || currency.trim().isEmpty()){
            throw new IllegalArgumentException("Currency is required");
        }

        if(balance <= 0.0){
            throw new IllegalArgumentException("Initial balance must be positive");
        }

        this.walletId = walletId;
        this.currency = currency;
        this.balance = balance;

    }

    public void credit(double amount){
        if(amount <= 0.0){
            throw new IllegalArgumentException("Credit amount must be positive");
        }

        balance+=amount;
    }

    public void debit(double amount){
        if(amount <= 0.0){
            throw new IllegalArgumentException("Debit amount must be positive");
        }

        if(amount > balance){
            throw new IllegalStateException("Insufficient Funds : Overdraft prevented");
        }

        balance-=amount;
    }

    public String getWalletId(){
        return walletId;
    }

    public String getCurrency(){
        return currency;
    }

    public double getBalance(){
        return balance;
    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }

        if(!(o instanceof DigitalWallet)){
            return false;
        }

        DigitalWallet that = (DigitalWallet) o;

        return Objects.equals(this.walletId, that.walletId);
    }

    @Override
    public int hashCode(){
        return Objects.hash(walletId);
    }
}