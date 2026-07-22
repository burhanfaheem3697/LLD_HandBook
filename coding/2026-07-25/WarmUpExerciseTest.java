import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * WarmUpExerciseTest
 */
public class WarmUpExerciseTest {

    private ArrayList<Integer> list = new ArrayList<>();

    @Test
    void testListIsEmpty(){
        list.add(32);
        assertFalse(list.isEmpty(),"List should not be empty");
    }
}