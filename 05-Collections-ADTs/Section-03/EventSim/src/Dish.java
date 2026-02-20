import java.util.Random;

public class Dish {
    private int dirtiness;

    public Dish(int dirtiness){
        this.dirtiness = dirtiness;
    }


    public int getTimeToClean(){
        return this.dirtiness;
    }

}
