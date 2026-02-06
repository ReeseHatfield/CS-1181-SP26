import java.util.*;

public class Driver {
    public static void main(String[] args) {

        // Holder<Number> box1 = new Holder<Number>(5.0);
        // Holder<Number> box2 = new Holder<Number>(1);

        Monster m1 = new Monster(120.0);


        Holder<Monster> coozie = new Holder<>(m1);

        coozie.printThing();



        ArrayList<Integer> reads = new ArrayList<>();
        reads.add(3);
        reads.add(3);
        reads.add(3);
        reads.add(3);

        printItem(reads);



        ArrayList<? super Integer> l1 = new ArrayList<>();

        l1.add(3);

        l1.get(0);

        








    }


    public static void printItem(ArrayList<? extends Integer> l1){
        for(int i = 0; i < l1.size(); i++){
            System.out.println(l1.get(i));
        }
    }


}