import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Random;

public class Driver {


    public static final int NUM_THREADS = 3;
    public static void main(String[] args) throws Exception {
        
        // writeWithRandom();x

        for(int i = 0; i < NUM_THREADS; i++){
            Files.copy(Path.of("nums.txt"), Path.of("nums-" + i + ".txt"));
        }

        ArrayList<AverageThread> threads = new ArrayList<>();
        for(int i = 0; i < NUM_THREADS; i ++){
            AverageThread cur = new AverageThread(new File("nums-" + i + ".txt" ), i);

            threads.add(cur);
            cur.start();
        }

        for(int i = 0; i < NUM_THREADS; i ++){
            threads.get(i).join();
        }

        double globalSum = 0;
        for(int i = 0; i < NUM_THREADS; i ++){
            globalSum += threads.get(i).getAverage();
        }

        double globalMean = globalSum / (double) NUM_THREADS;

        for(int i = 0; i < NUM_THREADS; i++){
            Files.delete(Path.of("nums-" + i + ".txt"));
        }


        System.out.println("Global mean was: " + globalMean);




    }



    public static void writeWithRandom() throws Exception{


        PrintWriter pw = new PrintWriter(new File("nums.txt"));

        Random rng = new Random();

        for(int i = 0; i < 1_000_000; i++) {

            pw.println(rng.nextInt(0, 101));
        }

        pw.close();
    }
}