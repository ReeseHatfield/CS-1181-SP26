import java.util.*;

public class Container {

    private ArrayList<Item> contents;

    // deep copy items
    public Container(ArrayList<Item> initial) {
        this.contents = new ArrayList<>();
        for(Item i: initial){
            this.contents.add(new Item(i));
        }


    }
}