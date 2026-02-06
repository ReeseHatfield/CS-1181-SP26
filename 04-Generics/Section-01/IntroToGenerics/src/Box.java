
// the first place you declare a generic
public class Box<T> {

    private T thingImHolding;
    
    public Box(T thingToHold){
        this.thingImHolding = thingToHold;
    }


    public T getThing(){
        return this.thingImHolding;
    }

    public String toString(){
        return "Box: " + this.thingImHolding.toString();
    }
}
