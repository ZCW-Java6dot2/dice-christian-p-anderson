import java.util.HashMap;

public class Bins {

    private int startingBin = 0;
    private int endingBin = 0;
    private int binNum = 0;

    public HashMap<Integer, Integer> results;


    // create a hashmap and put in starting bin number first and add one until you hit the last bin number which is the ending number
    public Bins(int startingBin, int endingBin) {
        this.startingBin = startingBin;
        this.endingBin = endingBin;

        this.results = new HashMap<Integer, Integer>();

        for (int i = startingBin; i <= endingBin; i++) {
            this.results.put(i, 0);
        }

    }


    // retrieve and get count for a bin
    public Integer getBin(int bin) {
        return this.results.get(bin);
    }


    // roll the dice and increment the value of the bin by one
    public void incrementValue(int binNum) {
        this.binNum = binNum;
        this.results.put(binNum, this.results.get(binNum) + 1);
    }

}


/* I don't care about having the data sorted, so store the information in a hashMap - it stores key value pairs
https://beginnersbook.com/2013/12/hashmap-in-java-with-example/
initiate the hashMap and make it grow as needed

Bins results = new Bins(2, 12); // for bins from 2..12
Integer numberOfTens = results.getBin(10); // returns the number of tens in the 10 bin
results.incrementBin(10); // should increment bin # 10

 */
