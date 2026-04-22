import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;
import java.util.*;

public class Driver {
    public static void main(String[] args) throws IOException {
        String book = Files.readString(
            Path.of("cleaned_RnJ.txt")
        );


        String start = "mercutio";

        Scanner input = new Scanner(System.in);
        Predictor pred = new Predictor(book.replace("‘", ""));

        while(true){
            System.out.print("User: ");
            String userText = input.nextLine().toLowerCase();

            String[] userWords = userText.trim().split(" ");

            String usableWord = userWords[userWords.length - 1];

            // System.out.println(book);
            ArrayList<String> fullReply = new ArrayList<>();

            fullReply.add(usableWord);
            for(int i = 0; i < 20; i ++){
                String nextWord = pred.nextWord(fullReply.getLast());
                fullReply.add(nextWord);
            }

            List<String> replyWords = fullReply.subList(1, fullReply.size());

            String replyToSend = "Bot: ";
            for(String cur: replyWords){
                replyToSend += " " + cur;
            }
            replyToSend = replyToSend.trim();

            System.out.println(replyToSend);


        }
        
    }

}