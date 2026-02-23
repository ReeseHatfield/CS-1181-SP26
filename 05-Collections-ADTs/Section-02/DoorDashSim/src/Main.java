import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // generic are parameter but for datatypes 

        NumberPrinter<Double> myPrinter = new NumberPrinter<>();


        myPrinter.printThing(3.14);

        NumberPrinter<Integer> intPrinter = new NumberPrinter<>();

        // intPrinter.printThing(3.14);


        Map<String, Integer> favoriteNumbers = new HashMap<>();
        favoriteNumbers.put("Gerry", 45);
        favoriteNumbers.put("Reese", 3);
        favoriteNumbers.put("Alice", 2);

        favoriteNumbers.put("Gerry", 12);


        System.out.println(favoriteNumbers.get("Gerry"));

    }


}