import java.util.*;

public class Container {

    private ArrayList<Item> contents;

    // shallow copy
    // public Container(ArrayList<Item> initial) {
    //     this.contents = initial;
    // }


    public Container(ArrayList<Item> initial){
        this.contents = new ArrayList<>();
        for(Item i: initial){
            this.contents.add(new Item(i));
        }
    }

    public String toString(){
        return "Contains: " + this.contents.toString();
    }
}