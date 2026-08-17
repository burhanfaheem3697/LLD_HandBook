package handbook.phase01.project01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import handbook.phase01.project01.api.DomainAccountFacade;
import handbook.phase01.project01.internal.CustomerAccount;

/**
 * DomainAccountFacadeTest
 */
public class DomainAccountFacadeTest {

    private DomainAccountFacade facade;

    @BeforeEach
    void setUp(){
        facade = new DomainAccountFacade();
    }

    @Test
    void testCreateAccountSuccess(){
        CustomerAccount account = facade.createAccount("ACC-9001", "100 Main St", "Boston", "02108", 250.0, "USD");
        assertNotNull(account);
        assertEquals("ACC-9001", account.getAccountId());
        assertEquals(250.0, account.getBalance().amount());

    }

    @Test
    void testDepositFundsSucess(){
        CustomerAccount account = facade.createAccount("ACC-9002", "200 Park Ave", "NYC", "10017", 500.0, "USD");
        facade.depositFunds(account, 150.0, "USD");
        assertEquals(650.0, account.getBalance().amount());
    }

    @Test
    void testCollectionEncapsulationOnAuditLogs(){
        CustomerAccount account = facade.createAccount("ACC-9003", "300 Lake Dr", "Chicago", "60601", 100.0, "USD");
        assertThrows(UnsupportedOperationException.class, () -> account.getAuditLogs().clear());
    }
}