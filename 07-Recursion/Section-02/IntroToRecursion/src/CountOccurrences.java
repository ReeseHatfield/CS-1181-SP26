public class CountOccurrences {
    
    public static int countOccurrences(String s, char target){
        return countOccurrencesHelper(s, target, 0);
    }


    private static int countOccurrencesHelper(String s, char target, int foundSoFar){
        if(s.isEmpty()){
            return foundSoFar;
        }

        char first = s.charAt(0);

        if(first == target){
            return countOccurrencesHelper(s.substring(1), target, foundSoFar + 1);
        }
        else {
            return countOccurrencesHelper(s.substring(1), target, foundSoFar);
        }
    }

}
