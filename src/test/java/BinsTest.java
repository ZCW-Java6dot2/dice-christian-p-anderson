import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinsTest {

    @Test
    public void testMinBin() {
        Bins testBin = new Bins(2, 12);
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
        testBin.incrementBin(2);
        int expected = 1;
        int actual = testBin.getBin(2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void incrementBinByMany() {
        Bins testBin = new Bins(2, 112);
        testBin.incrementBin(2);
        testBin.incrementBin(2);
        testBin.incrementBin(2);
        testBin.incrementBin(2);
        int expected = 4;
        int actual = testBin.getBin(2);
        Assertions.assertEquals(expected, actual);
    }
}
