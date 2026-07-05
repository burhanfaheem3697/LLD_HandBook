
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();

        double balance = account.getBalance();
        System.out.println(balance);

        account.deposit(239.13);

        balance = account.getBalance();


        System.out.println(balance);

        assert (balance != 239.13) : "Here is the proof that account balance is updated with the given value successfully";
    }
}