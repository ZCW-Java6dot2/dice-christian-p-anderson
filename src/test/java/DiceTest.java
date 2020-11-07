import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiceTest {

    @Test
    public void testTossAndSum() {
        int numOfDice = 5;
        int minScore = numOfDice * 1;
        int maxScore = numOfDice * 6;
        Dice testDice = new Dice(numOfDice);
        int actual = testDice.tossAndSum();

        Assertions.assertTrue(actual >= minScore && actual <= maxScore);
    }

    @Test
    public void getNumOfDice() {
        int numOfDice = 2;

        Dice testDice = new Dice(numOfDice);

        int expected = numOfDice;
        int actual = testDice.getNumberOfDice();

        Assertions.assertEquals(expected, actual);
    }

}
