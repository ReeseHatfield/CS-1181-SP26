import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;


public class Driver {
    public static void main(String[] args) throws IOException {

        FontAdjuster.adjustFontSize(20);

        new ChatBot("My First Chatbot");
    }

}