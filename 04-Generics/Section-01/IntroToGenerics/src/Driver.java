import java.util.*;
public class Driver {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(4);

        // list.add("list");

        // list.get(0)


        Box<Integer> b1 = new Box<>(4);
        Box<String> b2 = new Box<>("Hello");


        // Box<Integer> b3 = new Box<>("string");

        System.out.println(b1.getThing());
        System.out.println(b2.getThing());


        Pair<String, Integer> pair = new Pair<String,Integer>("hello world", 4);


        Pair<Integer, Box<String>> nestedBox= new Pair<>(6, new Box<String>("world"));

        System.out.println(nestedBox.unBox2());
    }



    // the first place you declare a generic
    public static <T> String printThing(T item) {
        System.out.println(item);

        return item.toString();
    }
}