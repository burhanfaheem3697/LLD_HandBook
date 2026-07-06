
public class TransactionEngine {
    public enum TxnType{DEPOSIT,WITHDRAW};

    public void process(Account account,TxnType type,double amount){
        if(account == null){
            throw new IllegalArgumentException("Account context can't be null");
        }

        if(amount < 0){
            throw new IllegalArgumentException("Transaction must be positive");
        }

        if(type == TxnType.DEPOSIT){
            account.credit(amount);
        } else if(type == TxnType.WITHDRAW){
            account.debit(amount);
        } else {
            throw new UnsupportedOperationException("Unknown transaction type");
        }
    }

}