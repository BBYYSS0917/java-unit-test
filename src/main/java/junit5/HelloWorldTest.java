package junit5;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * @author Donquixote
 * @date 2023/03/15
 **/
public class HelloWorldTest {

    @Test
    void firstTest() {
        assertEquals(2,1+1);
    }
}
