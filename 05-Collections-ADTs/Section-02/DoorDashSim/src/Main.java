import java.util.*;

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


        // Commuter c = new Commuter();

        // Drivable commuter = new Drivable() {
        //     public void drive(){
        //         System.out.println("You are driving a miata");
        //     }
        // };

        System.out.println();
        System.out.println();
        System.out.println();



        DrinkableCan monster = new DrinkableCan() {

            @Override
            public void drink() {
            }

            @Override
            public void recycle() {
            }
            
        };


        Drivable commuter = (c) -> {

            System.out.println("You drive a " + c);
        };

        driveToWork(new Bike());


        // Vehicle<String> v = new Vehicle<>("Alice");

        Stack<Set<String>> temp = new Stack<>();

        temp.push(new HashSet<>());
        temp.peek().add("Alice");
        temp.peek().add("Bob");
        temp.peek().add("Charlie");
        temp.peek().add("Alice");

        System.out.println(temp.pop().size());


        PriorityQueue<Item> pq = new PriorityQueue<>();
        pq.offer(new Item("Gatorade", 1.2));
        pq.offer(new Item("Cord", 2.6));
        pq.offer(new Item("Phone", 4.7));
        pq.offer(new Item("Mouse", 1.5));
        pq.offer(new Item("Laptop", 1.9));
        pq.offer(new Item("Keyboard", 2.4));
        pq.offer(new Item("Pen", 4.0));

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
            System.out.println(pq);
            System.out.println();
        }


    }


    public static void driveToWork(Drivable d){
        System.out.println("You are driving to work");
        d.drive("Elantra");

        // d.replaceChain();
    }


}