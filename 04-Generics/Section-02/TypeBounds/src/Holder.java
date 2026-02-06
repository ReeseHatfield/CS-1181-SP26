// first time you write a generic
// generic declaration
public class Holder<T extends Comparable<T>> {

    private T thingImHolding;


    public Holder(T thingToHold){
        this.thingImHolding = thingToHold;
    }


    public void foo(){

    }


    public void printThing(){
        System.out.println(this.thingImHolding);


    }
}
