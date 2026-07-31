package com.phase00.p00m03l03;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * UserFacadeTest
 */
public class UserFacadeTest {
    private UserFacade facade;

    @BeforeEach
    void setup(){
        facade = new UserFacade();
    }

    @Test
    void testUserRegisterationReturnsToken(){
        String token = facade.registerUser("admin", "secret123");
        assertNotNull(token);
        assertTrue(token.startsWith("TOKEN_ADMIN"));
    }


    @Test
    void testInvalidUsernameThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> facade.registerUser("ab", "sec234"));
    }

}