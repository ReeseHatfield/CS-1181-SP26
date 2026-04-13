import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Driver {

    public static final int numThreads = 5;
    public static void main(String[] args) throws Exception {
        // writeWithRandom();


        for(int i = 0; i < numThreads; i ++){
            Files.copy(Path.of("nums.txt"), Path.of("nums-" + i + ".txt"));
        }


        ArrayList<AverageThread> threads = new ArrayList<>();
        for(int i = 0; i < numThreads; i ++){
            AverageThread cur = new AverageThread(new File("nums-" + i + ".txt"), i);
            threads.add(cur);

            cur.start();
        }

        for(int i = 0; i < numThreads; i ++){
            threads.get(i).join();
        }

        double globalSum = 0;
        for(int i = 0; i < numThreads; i ++){
            globalSum += threads.get(i).getAverage();
        }

        double globalMean = globalSum / (double) numThreads;

        for(int i = 0; i < numThreads; i ++){
            Files.delete(Path.of("nums-" + i + ".txt"));
        }


        System.out.println("The final Mean was:");
        System.out.println(globalMean);


    }


    public static void writeWithRandom() throws Exception{


        PrintWriter pw = new PrintWriter(new File("nums.txt"));

        Random rng = new Random();

        for(int i = 0; i < 100_000_000; i++) {

            pw.println(rng.nextInt(0, 100));
        }

        pw.close();
    }
}