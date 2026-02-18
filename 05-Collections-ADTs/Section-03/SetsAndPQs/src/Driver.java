import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();

        mySet.add("Alice");
        mySet.add("Bob");
        mySet.add("Charlie");

        mySet.add("Bob");

        System.out.println(mySet);

        System.out.println(containsDupes("Reese"));
        System.out.println(containsDupes("cat"));


        System.out.println();
        System.out.println();
        System.out.println();

        PriorityQueue<Coffee> coffees = new PriorityQueue<>();

        coffees.offer(new Coffee(60));
        coffees.offer(new Coffee(75));
        coffees.offer(new Coffee(50));
        coffees.offer(new Coffee(150));

        
        System.out.println(coffees);
        Coffee drinkOne = coffees.poll();
        System.out.println(drinkOne);
        System.out.println();


        System.out.println(coffees);
        Coffee drinkTwo = coffees.poll();
        System.out.println(drinkTwo);

        System.out.println(coffees.peek());
        System.out.println(coffees);


        // bug tracking system
        // have different types of bugs
        // each bug type has a different
        PriorityQueue<Bug> todo = new PriorityQueue<>();
        todo.offer(new OffByOneBug("wrong for loop bounds"));
        todo.offer(new LogicBug("null pointer exception"));
        todo.offer(new OffByOneBug("linked list off by one"));
        todo.offer(new LogicBug("syntax error"));

        int devNumber = 1;
        while(!todo.isEmpty()){
            System.out.println("Developer " + devNumber);
            System.out.println("You are assigned:");
            System.out.println(todo.poll());
            System.out.println();
            devNumber++;
        }

    }


    // O(n)
    public static boolean containsDupes(String s){
        Set<Character> chars = new HashSet<>();

        for(Character cur: s.toCharArray()){
            chars.add(cur);
        }

        return chars.size() != s.length();
    }
}