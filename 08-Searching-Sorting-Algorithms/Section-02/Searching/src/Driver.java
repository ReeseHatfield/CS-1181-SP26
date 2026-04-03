import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Driver {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(
            "Alice", "Bob", "Charlie",
            "Alice", "Bob", "Charlie",
            "Alice", "Bob", "Charlie",
            "Alice", "Bob", "Derek"
        ));


        int i = linearSearch(list, "Charlie");

        System.out.println("Index was: " + i);


        i = linearSearch(list, "Derek");

        System.out.println("Index was: " + i);

        System.out.println();
        System.out.println();
        System.out.println();

        boolean isPresent = randomSearch(list, "Derek");

        System.out.println(isPresent);


        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 4, 6, 8, 9, 13, 15));

        int index = binarySearch(nums, -30, 0, list.size() - 1);

        System.out.println("Index with bin search was " + index);

    }


    // O(log(N))
    public static int binarySearch(ArrayList<Integer> list, Integer target, int left, int right){

        if(left > right){
            return -1;
        }
        // if the middle is the target
        int mid = (left + right) / 2;

        if(list.get(mid) == target){
            return mid;
        }


        if(list.get(mid) > target){
            return binarySearch(list, target, left, mid - 1);
        }
        else {
            return binarySearch(list, target, mid + 1, right);
        }
    }

    public static boolean randomSearch(ArrayList<String> list, String target){

        int operations = 0;

        operations += 2;
        while(true){

            operations += 2;
            if(list.get(0).equals(target)){

                System.out.println("Operations: " + operations);
                return true;
            }
            else {
                Collections.shuffle(list);
            }
        }
    }


    // list.size() = N
    // O(N)
    public static int linearSearch(ArrayList<String> list, String target){

        // * N

        // 4*N

        int operations = 0;

        operations += 2;

        for(int i = 0; i < list.size(); i ++){

            operations += 4;

            String cur = list.get(i);

            if(cur.equals(target)){



                // 1
                System.out.println("Took " + operations + " operations");
                return i;
            }
        }
        // 1

        
        System.out.println("Took " + operations + " operations");
        return -1;
    }
}