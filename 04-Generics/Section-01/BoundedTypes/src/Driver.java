import java.util.*;

public class Driver {
    public static void main(String[] args) {
        

        // Box<String> b1 = new Box<>("hello");

        Box<Integer> b2 = new Box<>(5);
        Box<Double> b3 = new Box<>(5.3);


        Box<Projector> b4 = new Box<>(new Projector());


        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);

        printItem(list);



        ArrayList<? super Integer> l2 = new ArrayList<>();

        l2.add(3);
        l2.add(9);
        l2.add(6);
        // l2.add

        l2.get(0);


        // Collections.sort(null);
    }

    public static void printItem(ArrayList<? extends Integer> list){
        for(int i = 0; i < list.size(); i ++){
            System.out.println(list.get(i));

            // list.get
        }
    }
}