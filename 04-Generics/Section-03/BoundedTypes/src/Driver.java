
import java.util.ArrayList;

public class Driver {
    public static void main(String[] args){


        // Box<String> b1 = new Box<String>("asdfasdf");


        // Box<Integer> b2 = new Box<Integer>(5);


        Box<Integer> b3 = new Box<Integer>(4);


        Box<Salad> b4 = new Box<Salad>(new Salad());


        // ArrayList<? extends Integer> l1 = new ArrayList<>();

        // l1.add(5);


        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);

        printItems(list);


        ArrayList<? super Number> l2 = new ArrayList<>();
        l2.add(4.0);

        l2.get(0);


    }

    public static void printItems(ArrayList<? extends Integer> printME){
        for(int i = 0; i < printME.size(); i ++){
            System.out.println(printME.get(i));
        }
    }
}