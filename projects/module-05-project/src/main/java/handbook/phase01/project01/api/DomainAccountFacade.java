package handbook.phase01.project01.api;

import java.util.List;

import handbook.phase01.project01.internal.Address;
import handbook.phase01.project01.internal.CustomerAccount;
import handbook.phase01.project01.internal.Money;

/**
 * DomainAccountFacade
 */
public class DomainAccountFacade {

    public CustomerAccount createAccount(String accountId, String street, String city, String zipCode, double initialAmount, String currency){
        Address address = new Address(street, city, zipCode);
        Money balance = new Money(initialAmount, currency);
        return new CustomerAccount(accountId, address, balance);
    }

    public void depositFunds(CustomerAccount account, double amount,String currency){
        if(account == null){
            throw new IllegalArgumentException("Account is required");
        }

        Money depositMoney = new Money(amount, currency);

        account.deposit(depositMoney);
    }

    public List<String> getAccountLogs(CustomerAccount account){
        if(account == null){
            throw new IllegalArgumentException("Account is required");
        }

        return account.getAuditLogs();
    }
}