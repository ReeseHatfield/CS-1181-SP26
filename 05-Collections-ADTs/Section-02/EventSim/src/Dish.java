public class Dish {
    private int dirtyness;

    public Dish(int dirtyness){
        this.dirtyness = dirtyness;
    }


    public int timeToClean(){
        return this.dirtyness;
    }
}
