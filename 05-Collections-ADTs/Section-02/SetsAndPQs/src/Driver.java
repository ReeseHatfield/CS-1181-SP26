import java.util.*;

public class Driver{
    public static void main(String[] args) {
        Set<String> mySet = new TreeSet<>();

        mySet.add("Alice");
        mySet.add("Bob");
        mySet.add("Charlie");
        mySet.add("Bob");

        if(mySet.contains("Alice")){
            System.out.println("Alice was in the set");
        }
        else{
            System.out.println("Alice was NOT in the set");
        }

        System.out.println(mySet);


        System.out.println(containsDupe("Reese"));
        System.out.println(containsDupe("cat"));

        System.out.println();

        PriorityQueue<Coffee> drinkMe = new PriorityQueue<>();

        drinkMe.offer(new Coffee(75));
        drinkMe.offer(new Coffee(50));
        drinkMe.offer(new Coffee(150));
        drinkMe.offer(new Coffee(60));


        
        System.out.println(drinkMe);
        Coffee firstDrink = drinkMe.poll();
        System.out.println(firstDrink);
        System.out.println();


        System.out.println(drinkMe);
        Coffee secondDrink = drinkMe.poll();
        System.out.println(secondDrink);


        System.out.println();
        System.out.println();
        // keep track of bugs in a queue
        // but I want certain bugs to be dealt with more urgently
    
        PriorityQueue<Bug> todoQ = new PriorityQueue<>();
        todoQ.offer(new IDEBug("vscode error"));
        todoQ.offer(new OffByOneBug("wrong for loop bounds"));
        todoQ.offer(new LogicBug("Incorrect ADT usage"));
        todoQ.offer(new OffByOneBug("linked list off by one"));
        todoQ.offer(new LogicBug("Invalid syntax"));

        System.out.println(todoQ.poll());
        System.out.println(todoQ.poll());
        System.out.println(todoQ.poll());

    }

    public static boolean containsDupe(String s){

        Set<Character> chars = new HashSet<>();

        for(Character cur: s.toCharArray()){
            chars.add(cur);
        }


        return s.length() != chars.size();
    }
}