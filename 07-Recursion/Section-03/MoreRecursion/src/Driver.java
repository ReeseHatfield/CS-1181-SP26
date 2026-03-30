public class Driver {
    public static void main(String[] args) {

        // System.out.println(isPalindrome("racecar"));
        // System.out.println();
        // System.out.println(isPalindrome("hello"));
        // System.out.println();
        // System.out.println(isPalindrome("tacocat"));
        // System.out.println();
        // System.out.println(isPalindrome("neveroddoreven"));
        // System.out.println();
        // System.out.println(isPalindrome(""));
        // System.out.println();


        // int[] arr = {1, 2, 3, 2, 1, 4, 1, 1, 4, 2, 5};
        // System.out.println(countNumber(1, arr, 0));

        System.out.println(insertStars("heello"));
    }


    public static String insertStars(String s){
        if(s.length() <= 1){
            return s;
        }


        char first = s.charAt(0);
        char second = s.charAt(1);

        if(first == second){
            return first + "*"  + insertStars(s.substring(1));
        }
        else {
            return first + insertStars(s.substring(1));
        }
    }

    public static int countNumber(int target, int[] arr, int index){
        if(index >= arr.length){
            return 0;
        }

        if(arr[index] == target){
            return 1 + countNumber(target, arr, index + 1);
        }
        else {
            return countNumber(target, arr, index + 1);
        }
    }



    public static boolean isPalindrome(String s){
        // return s.equals(s.reverse());

        if(s.length() <= 1){
            return true;
        }

        char first = s.charAt(0);
        char last = s.charAt(s.length() - 1);

        if(first == last){
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        
        return false;


    }
}