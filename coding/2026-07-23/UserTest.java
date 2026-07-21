import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
/**
 * UserTest
 */
public class UserTest {

    @Test
    void testValidUserCreation(){
       User user = new User("Alice");
       assertEquals("Alice",user.getUsername());
    }

    @Test
    void testInvalidUserThrowsException(){
        assertThrows(IllegalArgumentException.class,() -> {
            new User("ab");
        });
    }




}