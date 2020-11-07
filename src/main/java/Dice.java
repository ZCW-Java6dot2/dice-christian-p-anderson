public class Dice {

    private int numberOfDice;

    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public int tossAndSum() {
        int sumOfDice = 0;

        for (int i = 0; i < this.numberOfDice; i++) {
            sumOfDice += (int) ((Math.random() * 6) + 1);
        }

        return sumOfDice;
    }


    public int getNumberOfDice() {
        return this.numberOfDice;
    }
}
