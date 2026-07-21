

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * WarmUpExercise
 */
public class WarmUpExerciseTest {

    private StringBuilder str;

    @BeforeEach
    void setup(){
        str = new StringBuilder("Hello World!!!");
    }

    @Test
    void test(){
        assertNotNull(str,"String builder instance should not be null after setup");
    }
}