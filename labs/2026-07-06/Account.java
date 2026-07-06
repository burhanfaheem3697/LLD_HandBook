
public class Account {
    private double balance;

    public Account(double initialAmount){
        if(initialAmount < 0){
            throw new IllegalArgumentException("Overdraft prevented : Insufficient Funds");
        }

        this.balance = initialAmount;
    }

    public void credit(double amount){
        if(this.balance + amount > Double.MAX_VALUE || this.balance + amount < this.balance){
            throw new ArithmeticException("Balance overflow limit reached");
        }
        this.balance+=amount;
    }

    public void debit(double amount){
        if(amount > this.balance){
            throw new IllegalArgumentException("Overdraft prevented : Insufficient Funds");
        }

        balance-=amount;
    }
    
    public double getBalance(){
        return this.balance;
    }


}