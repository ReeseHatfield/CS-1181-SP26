import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();

        list.add(new String("hello"));

        Box<String> b1 = new Box<>("Hello World");

        Box<Integer> b2 = new Box<>(5);

        // cannot use primitive types in generics
        // Box<int> b3 = new Box(3);

        Duple<Box<Student>, Integer> d1 = new Duple<>(new Box<>(new Student()), 3);

        System.out.println(d1.getElem1());

    }
}