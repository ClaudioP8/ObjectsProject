import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class tester2{
    /**Test min */
    @Test
    public void testMin(){
        assertEquals(0, tester.min(0, 8));
        assertEquals(-8, tester.min(-8, 240));
    }

}