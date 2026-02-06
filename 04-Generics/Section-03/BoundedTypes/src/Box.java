import java.util.*;


// extends
// bounded type parameter
// public class Box<T extends Number, E extends ArrayList<T>> {

public class Box<T extends Comparable<T>>{
    private T thing;

    public Box(T thing){
        this.thing = thing;
    }
}
