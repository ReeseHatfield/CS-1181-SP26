import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.offer("Reese");
        q.offer("Hatfield");
        q.offer("is");
        q.offer("tired");

        String polled = q.poll();

        System.out.println(polled);
        System.out.println(q);

        String peeked = q.peek();
        System.out.println(peeked);

        System.out.println(q);

        // Stack<Queue<String>> s1 = new Stack<>();

        System.out.println();
        System.out.println();
        System.out.println();

        Map<String, String> favColors = new HashMap<>();

        favColors.put("Alice", "Red");

        favColors.put("Bob", "Blue");

        favColors.put("Charlie", "Cyan");

        System.out.println(favColors.get("Bob"));

        favColors.put("Alice", "Gray");

        String alicesFav = favColors.get("Alice");

        System.out.println(alicesFav);

        System.out.println(favColors);

        System.out.println(countOccurrences('i', "ReeseHat."));

    }

    // public static int countOccurrences(Character target, String searchMe){
    // // build a map
    // // characters -> number of occurances

    // Map<Character, Integer> map = new TreeMap<>();

    // // build the map

    // for(char c = 'a'; c <= 'z'; c++){
    // map.put(c, 0);
    // }

    // for(Character c: searchMe.toCharArray()){
    // int curValue = map.get(c);

    // map.put(c, curValue + 1);
    // }

    // System.out.println(map);

    // return map.get(target);
    // }

    public static int countOccurrences(Character target, String searchMe) {
        // build a map
        // characters -> number of occurances

        

        Map<Character, Integer> map = new HashMap<>();


        // build the map


        for (Character c : searchMe.toCharArray()) {

            if(map.containsKey(c)){

                int curValue = map.get(c);
    
                map.put(c, curValue + 1);
            }
            else {
                map.put(c, 1);
            }
        }

        // System.out.println(map);

        if(map.containsKey(target)){
            return map.get(target);
        }
        else {
            return 0;
        }

    }

}
