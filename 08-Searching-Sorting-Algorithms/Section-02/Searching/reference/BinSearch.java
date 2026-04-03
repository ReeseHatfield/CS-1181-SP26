import java.util.ArrayList;
import java.util.Collections;

public class BinSearch {

    public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<>();

        // add data
        list.add(10);
        list.add(3);
        list.add(7);
        list.add(1);
        list.add(20);
        Collections.sort(list);



        int result = binarySearch(list, 20, 0, list.size() - 1);


        System.out.println(result);
    }

    public static int binarySearch(ArrayList<Integer> list, int target, int left, int right) {
        if (left > right) {
            return -1; // not found
        }

        int mid = (left + right) / 2;

        if (list.get(mid) == target) {
            return mid;
        } else if (list.get(mid) > target) {
            return binarySearch(list, target, left, mid - 1);
        } else {
            return binarySearch(list, target, mid + 1, right);
        }
    }
}