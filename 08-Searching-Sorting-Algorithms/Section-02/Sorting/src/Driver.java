import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Driver {
    public static void main(String[] args) {


        // swap
        int a = 5;
        int b = 10;

        // int temp = a;
        // a = b; // 10
        // b = temp; // 5

        a = a + b; // a = 15
        b = a - b; // b = 15 - 10 = 5
        a = a - b; // a = 15 - 5 = 10

        // a = 10
        //  b = 5


        // Collections.swap(null, a, b);




        List<Integer> nums = new ArrayList<>();
        fillWithRandom(nums);
        System.out.println("Unsorted:");
        System.out.println(nums);
        System.out.println();

        System.out.println("Sorted:");
        nums = mergeSort(nums);
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

    // O(n * logn)
    public static List<Integer> mergeSort(List<Integer> list){
        if(list.size() <= 1){
            return list;
        }

        int middle = list.size() / 2;
        List<Integer> left = new ArrayList<>(list.subList(0, middle));
        List<Integer> right = new ArrayList<>(list.subList(middle, list.size()));

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
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