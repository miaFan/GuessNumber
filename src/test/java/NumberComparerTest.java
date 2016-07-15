import com.thoughtWorks.guessNumber.NumberComparer;
import org.junit.Assert;
import org.junit.Test;

public class NumberComparerTest {
    @Test
    public void should_return_0A0B_when_comparing_1234_and_5678() {
        NumberComparer numberComparer = new NumberComparer();
        String result = numberComparer.compare("1234", "5678");
        Assert.assertEquals("0A0B", result);
    }

    @Test
    public void should_return_4A0B_when_comparing_1234_and_1234() {
        NumberComparer numberComparer = new NumberComparer();
        String result = numberComparer.compare("1234", "1234");
        Assert.assertEquals("4A0B", result);
    }


}
