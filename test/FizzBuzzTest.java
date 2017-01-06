import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Joe on 06/01/2017.
 */
public class FizzBuzzTest {

    private FizzBuzz fb;

    @Before
    public void setUp() throws Exception {
        fb = new FizzBuzz();
    }

    @Test

    public void oneReturnsOne() {
        assertEquals("1", fb.evaluate(1));
    }

    @Test

    public void twoReturnsTwo() {
        assertEquals( "2", fb.evaluate(2));
    }

    @Test

    public void threeReturnsFizz() {
        assertEquals("Fizz", fb.evaluate(3));
    }

    @Test

    public void fiveReturnsBuzz() {
        assertEquals("Buzz", fb.evaluate(5));
    }

    @Test

    public void fifteenReturnsFizBuzz() {
        assertEquals("FizzBuzz", fb.evaluate(15));
    }
}
