package junit4;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * @author Donquixote
 * @date 2023/03/14
 **/
public class HelloWorldTest {

    @Test(timeout = 1000)
    @Ignore
    public void firstTest() {
//        assertEquals()
        assertEquals(2,1+1);
    }
}
