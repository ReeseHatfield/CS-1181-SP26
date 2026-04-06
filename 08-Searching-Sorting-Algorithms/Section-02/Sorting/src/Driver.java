import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Driver {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        fillWithRandom(nums);
        System.out.println("Unsorted:");
        System.out.println(nums);
        System.out.println();

        System.out.println("Sorted:");
        nums = bubbleSort(nums);
        System.out.println(nums);
    
    }

    // O(N^2)
    public static List<Integer> bubbleSort(List<Integer> list){
        List<Integer> copy = new ArrayList<>(list);

        // repeat for list.size number of passes


        // N
        for(int i = 0; i < copy.size(); i ++){

            // bubbles the largest value to the top

            // N
            for(int j = 0; j < copy.size() - 1; j++){
                if(copy.get(j) > copy.get(j + 1)){
                    Collections.swap(copy, j, j + 1);
                }
            }
        }

        return copy;

    }


    public static void fillWithRandom(List<Integer> list){

        Random rng = new Random();

        for(int i = 0; i < 100; i++) {
            list.add(rng.nextInt(0, 100));
        }
    }


    // O(n) merge two sorted lists
    private static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>();
        int i = 0; 
        int j = 0; 

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result;
    }
}