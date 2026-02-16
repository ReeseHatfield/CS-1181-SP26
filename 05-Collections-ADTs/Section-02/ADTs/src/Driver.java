import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Stack<Phone> s = new Stack<>();
        s.push(new Phone(100.5));
        s.push(new Phone(105.5));
        s.push(new Phone(500));

        System.out.println(s.pop());

        // doThing();

        Queue<String> q = new ArrayDeque<>();

        q.offer("Reese");
        q.offer("Hatfield");
        q.offer("is");
        q.offer("tired");

        String polled = q.poll();

        System.out.println(polled);

        System.out.println(q.peek());

        System.out.println(q);

        System.out.println();
        System.out.println();
        System.out.println();

        Map<String, String> favoriteColors = new TreeMap<>();

        favoriteColors.put("Reese", "Red");
        favoriteColors.put("Kayleigh", "Blue");
        favoriteColors.put("Bibek", "Blue");
        favoriteColors.put("Clarissa", "Purple");

        String reesesFav = favoriteColors.get("Reese");

        favoriteColors.put("Bibek", "Gray");

        System.out.println(favoriteColors.get("Bibek"));

        System.out.println(reesesFav);

        System.out.println(countLetter('E', "Reese"));


    }

    // public static int countLetter(Character target, String searchMe){
    // // map
    // // char -> num of occurrences

    // Map<Character, Integer> letterMap = new HashMap<>();

    // // build this

    // for(char c = 'a'; c <= 'z'; c++){
    // letterMap.put(c, 0);
    // }

    // for(Character cur: searchMe.toCharArray()){
    // int curCount = letterMap.get(cur);

    // letterMap.put(cur, curCount + 1);
    // }

    // System.out.println(letterMap);

    // return letterMap.get(target);
    // }

    public static int countLetter(Character target, String searchMe) {
        // map
        // char -> num of occurrences

        Map<Character, Integer> letterMap = new HashMap<>();

        // build this


        for (Character cur : searchMe.toCharArray()) {

            if(letterMap.containsKey(cur)){
                int curCount = letterMap.get(cur);
    
                letterMap.put(cur, curCount + 1);
            }
            else {
                letterMap.put(cur, 1);
            }
        }

        System.out.println(letterMap);


        if(letterMap.containsKey(target)){
            return letterMap.get(target);
        }
        else {
            return 0;
        }
    }

    public static void doThing() {
        foo();
    }

    public static void foo() {
        System.out.println("hello");

        throw new NullPointerException();
    }
}