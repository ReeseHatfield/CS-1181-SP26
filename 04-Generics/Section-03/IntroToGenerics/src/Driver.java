import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();



        Box<String> b1 = new Box<String>("hello");




        Box<Double> d1 = new Box<>(5.0); 

        d1.getElement();
        b1.getElement();

        Pair<String, Integer> p1 = new Pair<>("Hello", 5);

        // list.add(new Box<Integer>(5));

    }
}