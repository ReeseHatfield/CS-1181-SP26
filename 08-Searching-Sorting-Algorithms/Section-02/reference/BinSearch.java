public class BinSearch {
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