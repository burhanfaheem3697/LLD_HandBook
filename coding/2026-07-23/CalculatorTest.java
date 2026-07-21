import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * CalculatorTest
 */
public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator calc = new Calculator();

        assertEquals(4,calc.add(1, 3));
    }
    
}