import java.util.*;

public class Driver {
    public static void main (String[] args){

        // ArrayList<Box<Integer>> list = new ArrayList<>();
        // list.add(new Box<Integer>(4));
        // list.add(new Box<Integer>(1));
        // list.add(new Box<Integer>(5));
        // list.add(new Box<Integer>(6));

        // System.out.println(list);
        // Collections.sort(list);

        // System.out.println(list);

        // System.out.println();
        // System.out.println();


        // ArrayList<Item> al = new ArrayList<>();
        // al.add(new Item("A"));
        // al.add(new Item("B"));
        // al.add(new Item("C"));
        // // al.add(new Item("D"));

        // Container c = new Container(al);

        // al.add(new Item("D"));

        // System.out.println(al);
        
        // System.out.println(c);

        // System.out.println();
        // System.out.println();
        // System.out.println();


        // Map<String, Integer> favNumbers = new HashMap<>();
        // favNumbers.put("Reese", 23);
        // favNumbers.put("Alice", 4);
        // favNumbers.put("Bobs", 9);
        // favNumbers.put("Reese", 47);

        // System.out.println(favNumbers.get("Reese"));

        // Set<Double> coolMathConstants = new HashSet<>();

        // coolMathConstants.add(3.14);
        // coolMathConstants.add(2.17);
        // coolMathConstants.add(1.0);
        // coolMathConstants.add(-1.0);
        
        // coolMathConstants.add(3.14);


        // // this contains method is (usually) really fast
        // System.out.println(coolMathConstants.contains(-1.0));
        // System.out.println(coolMathConstants.size());

        Comparator<Item> cmpInner = new Comparator<Item>() {

            @Override
            public int compare(Item i1, Item i2) {
                return i2.getWeight().compareTo(i1.getWeight());
            }
            
        };

        Comparator<Item> cmp = (i1, i2) -> {
            return i2.getWeight().compareTo(i1.getWeight());
        };



        // lambda are more concise versions of anonymouse inner class
        PriorityQueue<Item> pq = new PriorityQueue<>((i1, i2) -> {
            return i2.getWeight().compareTo(i1.getWeight());
        });

        pq.offer(new Item("Laptop", 5.6, 200));
        pq.offer(new Item("Remote", 0.4, 5));
        pq.offer(new Item("Keyboard", 1.3, 30));
        pq.offer(new Item("Mouse", 1.6, 20));
        pq.offer(new Item("Pen", 0.4, 25));

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
            System.out.println(pq);
            System.out.println();
        }



        Drivable d1 = (c) -> {
            System.out.println("You are driving a " + c);
        };

        goToWork(d1);

        DrinkableCan dc = new DrinkableCan() {

            @Override
            public void drink() {
                System.out.println("Drinks can");
            }

            @Override
            public void recycle() {
                System.out.println("Throws away");
            }
            
        };


        Car<String> c = new Car<>("alice");

    }

    public static void goToWork(Drivable d){
        System.out.println("You are going to work");
        d.drive("Miata");

    }
}