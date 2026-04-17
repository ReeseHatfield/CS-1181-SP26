import java.util.ArrayList;
import java.util.Random;

public class Driver {


    public static void main(String[] args) throws InterruptedException {
        
        ArrayList<Integer> list = randomList();

        // System.out.println(list);

        // int target = -1;
        // System.out.println("Starting search");
        // for(int i = 0; i < list.size(); i++){
        //     if(isEqual(list.get(i), target)){
        //         System.out.println("Found value!");
        //     }
        // }
        // System.out.println("Ending search");
        int target = -1;

        int numThreads = 8;
        ArrayList<Searcher> threads = new ArrayList<>();
        for(int i = 0; i < numThreads; i++){

            int chunkSize = list.size() / numThreads;

            int start = i * chunkSize;
            int end = start + chunkSize;
            
            if(i == numThreads - 1){
                end = list.size();
            }

            ArrayList<Integer> portion = new ArrayList<>(list.subList(start, end));

            Searcher cur = new Searcher(portion, target, i);
            threads.add(cur);
            cur.start();
        }

        for(int i = 0; i < numThreads; i ++){
            threads.get(i).join();
        }
    }


    public static boolean isEqual(int a, int b){
        try {
            // simulating work
            Thread.sleep(1);
        } catch (InterruptedException e) {
            // ignore
        }

        return a == b; 
    }

    public static ArrayList<Integer> randomList(){
        int size = 50_000;

        ArrayList<Integer> list = new ArrayList<>(size);


        Random rng = new Random();
        for(int i = 0; i < size; i++){
            list.add(rng.nextInt(0, 999));
        }


        int index = rng.nextInt(0, size);

        list.set(index, -1);


        return list;
    }
}