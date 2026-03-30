public class Driver {
    public static void main(String[] args) {
        // System.out.println(isPalindrome("racecar"));
        // System.out.println(isPalindrome("neveroddoreven"));


        // int[] arr = {
        //     1, 2, 3, 4, 11, 6, 11, 4
        // };

        // System.out.println(countNumber(12, 0, arr));


        System.out.println(insertStars("heello"));
        System.out.println(insertStars("aaa"));
        System.out.println(insertStars("aabb"));
    }

    public static String insertStars(String s){

        // System.out.println(s);

        // base case
        if (s.length() <= 1){
            return s;
        }

        char first = s.charAt(0);
        char second = s.charAt(1); // ask if this is always a valid call?

        if(first == second){
            // found a duplicate

            return first + "*" + insertStars(s.substring(1));
        }

        return first + insertStars(s.substring(1));





    }

    public static int countNumber(int target, int index, int[] arr){

        // base case
        if(index >= arr.length){
            return 0;
        }

        // recursive step

        if(target == arr[index]){
            return 1 + countNumber(target,  index + 1, arr);
        }

        return  0 + countNumber(target, index + 1, arr);

    }

    public static boolean isPalindrome(String s){
        // return s.equals(s.reverse())

        // we wrote this in class, but it is too similar to your lab code. Had to be there :)
        return true;

    }
}