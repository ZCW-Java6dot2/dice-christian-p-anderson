import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinsTest {

    @Test
    public void testMinBin() {
        Bins testBin = new Bins(2, 12); // if 2 dice then min score is 2 and max is 12
        int actual = testBin.getBin(2);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxBin() {
        Bins testBin = new Bins(2, 12);
        int actual = testBin.getBin(12);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void incrementBinByOne() {
        Bins testBin = new Bins(2, 14);
        testBin.incrementValue(2);
        int expected = 1;
        int actual = testBin.getBin(2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void incrementValueByMany() {
        Bins testBin = new Bins(2, 112);
        testBin.incrementValue(2);
        testBin.incrementValue(2);
        testBin.incrementValue(2);
        testBin.incrementValue(2);
        int expected = 4;
        int actual = testBin.getBin(2);
        Assertions.assertEquals(expected, actual);
    }
}
