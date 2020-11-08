import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Simulation {

    private int numberOfDice;
    private int numberOfTosses;
    private Bins simulationBins;

    public Simulation(int numberOfDice, int numberOfTosses) {
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
    }

    public void runSimulation() {
        Dice simulationDice = new Dice(this.numberOfDice);
        simulationBins = new Bins(this.numberOfDice, (this.numberOfDice * 6)); // based on the sample code provided in the Readme file

        for (int i = 0; i < this.numberOfTosses; i++) {
            int bin = simulationDice.tossAndSum();
            simulationBins.incrementValue(bin);
        }
    }

    public void saveToFile() throws FileNotFoundException {
        PrintStream file = new PrintStream(new File("christianResults.md"));

        System.setOut(file);

        StringBuilder results = new StringBuilder();

        results.append("--- Simulation of " + this.numberOfDice + " dice tossed for " + this.numberOfTosses + " ---\n");

        for (int bin : simulationBins.results.keySet()) {
            int value = simulationBins.results.get(bin);
            results.append(String.format("%3d : %8d : %4.2f ", bin, value, ((double) value / (double) this.numberOfTosses)));
            int stars = (int) Math.floor((double) (value / (this.numberOfTosses / 100)));
            results.append(numberOfStars("*", stars) + "\n");
        }

        System.out.println(results.toString());
    }

    public String numberOfStars(String stringToRepeat, int numberOfTimes) {
        String returnString = "";

        for (int i = 0; i < numberOfTimes; i++) {
            returnString += stringToRepeat;
        }

        return returnString;
    }


}
