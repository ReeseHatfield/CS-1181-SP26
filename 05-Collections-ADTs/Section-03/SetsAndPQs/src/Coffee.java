public class Coffee implements Comparable<Coffee>{
    
    private Integer caffeineInMgs;


    public Coffee(int caffeineInMgs){
        this.caffeineInMgs = caffeineInMgs;
    }


    @Override
    public int compareTo(Coffee other) {

        if(this.caffeineInMgs > other.caffeineInMgs){
            return -1;
        }
        else if(this.caffeineInMgs < other.caffeineInMgs){
            return  +1;
        }
        else {
            return 0;
        }
    }

    public String toString(){
        return "" + this.caffeineInMgs;
    }


}
