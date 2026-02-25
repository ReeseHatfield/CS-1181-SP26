
// A class for a box, that holds any type that can be sorted in a list. 
//The box itself should be sortable in a list

// be able to interpret this
// in a generic context -> always extends even with interfaces

public class Box<T extends Comparable<T>> implements Comparable<Box<T>>{
    
    private T thingToHold;

    public Box(T thingToHold){
        this.thingToHold = thingToHold;
    }

    @Override
    public int compareTo(Box<T> other) {
        return this.thingToHold.compareTo(other.thingToHold);
    }

    public String toString(){
        return "Box<" + this.thingToHold.toString() + ">";
    }

}
