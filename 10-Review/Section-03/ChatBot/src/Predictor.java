import java.util.*;

public class Predictor {
    private HashMap<String, ArrayList<String>> map = new HashMap<>();

    public Predictor(String data){
        ArrayList<String> words = new ArrayList<String>(
            Arrays.asList(data.trim().split(" "))
        );

        for(int i = 0; i < words.size() - 1; i ++){
            String curWord = words.get(i);
            String nextWord = words.get(i + 1);

            // System.out.println("cur word: " + curWord);
            // System.out.println("next word: " + nextWord);

            if(this.map.containsKey(curWord)){
                this.map.get(curWord).add(nextWord);

            } else {
                // key not present
                ArrayList<String> newList = new ArrayList<>();
                newList.add(nextWord);

                this.map.put(curWord, newList);
            }
        }

        // System.out.println(this.map);

        // System.out.println(words);
    }

    public String nextWord(String context){
        ArrayList<String> possibleNextWords = this.map.get(context);

        Random rng = new Random();

        int index = rng.nextInt(0, possibleNextWords.size());

        return possibleNextWords.get(index);

    }
}