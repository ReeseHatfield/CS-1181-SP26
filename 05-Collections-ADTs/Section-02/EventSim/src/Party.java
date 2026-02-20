import java.util.Random;

public class Party {
    private int numPeople;

    public Party(){
        Random rng = new Random();

        this.numPeople = rng.nextInt(3, 6);
    }

    public int getNumPeople(){
        return this.numPeople;
    }


    public String toString(){
        return "" + this.numPeople;
    }
}
