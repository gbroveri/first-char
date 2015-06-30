import com.firstchar.FirstCharFinder;
import com.firstchar.StringStream;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gbroveri on 29/06/15.
 */
public class FirstCharFinderTests {
    @Test
    public void test_with_short_string() {
        Character retval = FirstCharFinder.firstChar(new StringStream("aAbBABac"));
        Assert.assertTrue("expected = b but got " + retval, retval.equals(Character.valueOf('b')));
    }

    @Test
    public void test_with_longer_string() {
        Character retval = FirstCharFinder.firstChar(new StringStream("bcdefghijklmnopqrstuvwxyzbcdefghijklmnopqrstuvwxyzbcadefghijklmnopqrstuvwxyzbcdefghijklmnopqrstuvwxyzbcdefghijklmnopqrstuvwxyzbcdefghijklmnopqrstuvwxyzbcdefghijklmnopqrstuvwxyzbcdefghijklmnopqrstuvwxyzbcdefghijklmnopqrstuvwxyzbcdefghijklmnopqrstuvwxyz"));
        Assert.assertTrue("expected = a but got " + retval, retval.equals(Character.valueOf('a')));
    }

    @Test
    public void test_with_unique_char_as_first() {
        Character retval = FirstCharFinder.firstChar(new StringStream("baABABac"));
        Assert.assertTrue("expected = b but got " + retval, retval.equals(Character.valueOf('b')));
    }

    @Test
    public void test_with_unique_char_as_last() {
        Character retval = FirstCharFinder.firstChar(new StringStream("aABABac"));
        Assert.assertTrue("expected = c but got " + retval, retval.equals(Character.valueOf('c')));
    }

    @Test
    public void test_no_unique_found() {
        Character retval = FirstCharFinder.firstChar(new StringStream("aaAAbbBBccCC"));
        Assert.assertTrue("expected = null but got " + retval, retval.equals(Character.valueOf('\u0000')));
    }
}
