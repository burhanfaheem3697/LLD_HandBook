import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * UserTest
 */
public class UserTest {

    @Test
    void correctUsernameTest(){
        User user = new User("Alice");
        assertEquals("Alice",user.getUsername());
    }

    @Test
    void throwsExceptionTest(){
        Throwable exception = assertThrows(IllegalArgumentException.class,() -> new User(null));

        System.out.println("Here is the exception : " + exception.getClass().getName());
        System.out.println("Message : " + exception.getMessage());
    }
}