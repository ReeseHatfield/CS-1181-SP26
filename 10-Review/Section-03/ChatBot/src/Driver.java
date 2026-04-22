import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;

public class Driver {
    public static void main(String[] args) throws IOException {
        String book = Files.readString(Path.of("cleaned_RnJ.txt"));

        System.out.println(book);

    }

}