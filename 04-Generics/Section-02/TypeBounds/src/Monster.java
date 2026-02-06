public class Monster implements Comparable<Monster> {
    

    private double caffeineInMilligrams;

    public Monster(double caffeine){
        this.caffeineInMilligrams = caffeine;
    }

    @Override
    public int compareTo(Monster other) {

        return Double.compare(this.caffeineInMilligrams, other.caffeineInMilligrams);
    }


    public String toString(){
        return "" + this.caffeineInMilligrams;
    }
}
