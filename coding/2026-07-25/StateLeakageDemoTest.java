import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * StateLeakageDemoTest
 */
public class StateLeakageDemoTest {

    private List<Integer> list;

    @BeforeEach
    void setup(){
        list = new ArrayList<>();
    }


    @Test
    void test1(){
        list.add(3);
        assertEquals(1,list.size(),"List size should be one!");
    }

    @Test
    void test2(){
        list.add(2);
        assertEquals(1,list.size(),"List size should be one!");
    }
}