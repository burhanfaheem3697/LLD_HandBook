package handbook.phase01.project01.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CustomerAccount
 */
public class CustomerAccount {

    private final String accountId;
    private final Address address;
    private Money initialBalance;
    private final List<String> auditLogs = new ArrayList<>();

    public CustomerAccount(String accountId, Address address, Money initialBalance){
        if(accountId == null || accountId.isBlank()){
            throw new IllegalArgumentException("Account Id is required");
        }

        if(address == null){
            throw new IllegalArgumentException("Address is required");
        }

        if(initialBalance == null){
            throw new IllegalArgumentException("Initial Balance is required");
        }

        this.accountId = accountId;
        this.address = address;
        this.initialBalance = initialBalance;

        auditLogs.add("Account created with balance : " + initialBalance.amount());
    }

    public void deposit(Money amount){
        if(amount == null){
            throw new IllegalArgumentException("Amount is required");
        }

        initialBalance = initialBalance.add(amount);
        auditLogs.add("Deposited amount : " + amount.amount() + " " + amount.currency());
    }

    public String getAccountId(){
        return accountId;
    }

    public Address getAddress(){
        return address;
    }

    public Money getBalance(){
        return initialBalance;
    }

    public List<String> getAuditLogs(){
        return List.copyOf(auditLogs);
    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }

        if(!(o instanceof CustomerAccount)){
            return false;
        }

        CustomerAccount that = (CustomerAccount) o;

        return Objects.equals(this.accountId, that.accountId);
    }

    @Override
    public int hashCode(){
        return Objects.hash(accountId);
    }
}