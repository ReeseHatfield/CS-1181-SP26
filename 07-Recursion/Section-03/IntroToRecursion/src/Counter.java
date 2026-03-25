public class Counter {
    
    public static int countOccurrences(String s, char target){
        return countOccurrencesHelper(s, target, 0);
    }


    private static int countOccurrencesHelper(String s, char target, int foundSoFar){

        // System.out.println("Count Occurneces being called with String");
        // System.out.println(s);
        // System.out.println();

        if(s.isEmpty()){
            return foundSoFar;
        }

        char first = s.charAt(0);
        String remaining = s.substring(1);

        if(first == target){
            return countOccurrencesHelper(remaining, target, foundSoFar + 1);
        }
        else {
            return countOccurrencesHelper(remaining, target, foundSoFar + 0);
        }



    }

}
