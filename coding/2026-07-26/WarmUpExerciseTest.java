import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * WarmUpExerciseTest
 */
public class WarmUpExerciseTest {

    WarmUpExercise w = new WarmUpExercise();

    @Test
    void testQuantityEqualsZeroThrowsException(){
        assertThrows(IllegalArgumentException.class,() -> w.setQuantity(0),"Should throw illegal argument exception for quantity equals zero");
    }
}