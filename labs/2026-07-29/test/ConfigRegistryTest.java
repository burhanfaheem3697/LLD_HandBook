
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * ConfigRegistryTest
 */
public class ConfigRegistryTest {

    private ConfigRegistry registry;

    @BeforeEach
    void setup(){
        registry = new ConfigRegistry();
    }


    @Test
    void testForSetMethod(){
        assertAll("Set Method Checks",
            () -> assertThrows(IllegalArgumentException.class, () -> registry.set(null,"aasdf"),"Should throw exception for null value of key"),
            () -> assertThrows(IllegalArgumentException.class,() -> registry.set("     ","asdfa"),"Should throw error for empty value of key"),
            () -> assertThrows(IllegalArgumentException.class,() -> registry.set("asdfss",null),"Should throw error for null value of value")
        );
    }

    @Test
    void testForGetMethod(){
        assertAll("Get Method Checks",
            () -> assertThrows(IllegalArgumentException.class,() -> registry.get(null),"Should throw exception for null value of key"),
            () -> assertThrows(IllegalArgumentException.class,() -> registry.get("     "),"Should throw exception for empty value of key")
        );
    }

    @Test
    void testForContainsKeyMethod(){
        registry.set("hello","world");
        assertAll("Contains Key Method Checks",
            () -> assertFalse(registry.containsKey(null),"Should return false for null value of key"),
            () -> assertFalse(registry.containsKey("    "),"Should return false for empty value of key"),
            () -> assertFalse(registry.containsKey("sadfa"),"Should return false as key is not present"),
            () -> assertTrue(registry.containsKey("hello"),"Should return true as key is present")
        );
    }

    @Test
    void testForGetSizeMethod(){
        registry.set("env","dev");
        assertEquals(1,registry.getSize(),"Size should be 1");
    }

}