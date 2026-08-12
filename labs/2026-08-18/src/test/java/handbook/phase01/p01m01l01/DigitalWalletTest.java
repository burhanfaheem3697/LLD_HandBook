package handbook.phase01.p01m01l01;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * DigitalWalletTest
 */
public class DigitalWalletTest {

    private DigitalWallet wallet;

    @BeforeEach
    void setup(){
        wallet = new DigitalWallet("W-1001", "USD", 500.0);
    }

    @Test
    void testCreditIncreasesBalance(){
        wallet.credit(200.0);
        assertEquals(700.0, wallet.getBalance(),0.001);
    }

    @Test
    void testDebitDecreasesBalance(){
        wallet.debit(150.0);
        assertEquals(350.0, wallet.getBalance(),0.001);
    }

    @Test
    void testInvalidDebitAmountThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> wallet.debit(0.0));
    }

    @Test
    void testOverdraftThrowsIllegalStateException(){
        assertThrows(IllegalStateException.class, () -> wallet.debit(700.0));
    }

    @Test
    void testInvalidCreditAmountThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> wallet.credit(-50.0));
    }

    @Test
    void testHashSetIdentityIntegrityAfterStateMutation(){
        Set<DigitalWallet> set = new HashSet<>();
        set.add(wallet);

        wallet.credit(500.0);
        wallet.debit(100.0);

        assertTrue(set.contains(wallet));
        assertTrue(set.contains(new DigitalWallet("W-1001", "USD", 234.4)));
    }

    @Test
    void testForConstructorValidations(){
        assertAll("Checking constructor validations",
            () -> assertThrows(IllegalArgumentException.class, () -> new DigitalWallet(null, null, 0.0)),
            () -> assertThrows(IllegalArgumentException.class, () -> new DigitalWallet("    ", null, 0.0)),
            () -> assertThrows(IllegalArgumentException.class, () -> new DigitalWallet("W-1002", null, 0.0)),
            () -> assertThrows(IllegalArgumentException.class, () -> new DigitalWallet("W-1002", "    ", 0.0)),
            () -> assertThrows(IllegalArgumentException.class, () -> new DigitalWallet("W-1002", "USD", 0.0))
        );
    }

    @Test
    void testReflexiveEquals(){
        assertTrue(wallet.equals(wallet));
    }

    @Test
    void testInvalidInstanceEqualsFalse(){
        DigitalWalletTest walletTest = new DigitalWalletTest();
        assertFalse(wallet.equals(walletTest));
    }

    @Test
    void testForGetters(){
        assertAll("Check getters",
            () -> assertEquals("W-1001", wallet.getWalletId()),
            () -> assertEquals("USD", wallet.getCurrency())
        );
    }
}