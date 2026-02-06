public class Soda implements Comparable<Soda>{
    private double sweetnessLevel;
    private String name;

    public Soda(double sweetnessLevel, String name){
        this.sweetnessLevel = sweetnessLevel;
        this.name = name;
    }


    public int compareTo(Soda other){

        

        if(this.sweetnessLevel < other.sweetnessLevel){
            return -1;
        }else if(this.sweetnessLevel > other.sweetnessLevel){
            return +1;
        }
        else {
            return 0;
        }
    }

    public String toString(){
        return "" + this.name;
    }


    public String getName(){
        return this.name;
    }


}
