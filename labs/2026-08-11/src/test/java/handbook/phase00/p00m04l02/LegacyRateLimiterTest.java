package handbook.phase00.p00m04l02;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LegacyRateLimiterTest {
    private LegacyRateLimiter legacyRateLimiter;

    @BeforeEach
    void setup(){
        legacyRateLimiter = new LegacyRateLimiter(3);
    }

    @Test
    void testAllowedRequestUnderLimit(){
        assertAll("Check for 3 requests",
            () -> assertTrue(legacyRateLimiter.allowRequest("ClientA")),
            () -> assertTrue(legacyRateLimiter.allowRequest("ClientA")),
            () -> assertTrue(legacyRateLimiter.allowRequest("ClientA"))    
        );
    }

    @Test
    void testExceedingLimitRejectsRequest(){
        legacyRateLimiter.allowRequest("ClientB");
        legacyRateLimiter.allowRequest("ClientB");
        legacyRateLimiter.allowRequest("ClientB");
        assertFalse(legacyRateLimiter.allowRequest("ClientB"));
    }

    @Test
    void testIndependentClientDoNotInterfere(){
        legacyRateLimiter.allowRequest("ClientC");
        legacyRateLimiter.allowRequest("ClientC");
        legacyRateLimiter.allowRequest("ClientC");
        
        assertAll("Check for independent clients",
            () -> assertFalse(legacyRateLimiter.allowRequest("ClientC")),
            () -> assertTrue(legacyRateLimiter.allowRequest("ClientD"))
        );
    }

    @Test
    void testInvalidClientIdThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> legacyRateLimiter.allowRequest(null));
    }
    
}