import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Driver {

    public static void main(String[] args){
        List<Integer> searchMe = randomList();

        int target = -1;

        int numThreads = 8;
        ArrayList<Searcher> threads = new ArrayList<>();
        for(int i = 0; i < numThreads; i++){

            int chunkSize = searchMe.size() / numThreads;

            int start = i * chunkSize;
            int end = start + chunkSize;
            if(i == numThreads - 1){
                end = searchMe.size();
            }
            System.out.println("Thread + " + i);
            System.out.println("Gets work from " + start + " to " + end);
            System.out.println();

            List<Integer> portion = new ArrayList<>(searchMe.subList(start, end));

            Searcher cur = new Searcher(portion, i, target);

            threads.add(cur);
            cur.start();
        }

        for(int i = 0; i < threads.size(); i ++){
            try {
                threads.get(i).join();
            } catch (InterruptedException e) {
                // ignore
            }
        }

        System.out.println("Completed search");

        // for(int i = 0; i < searchMe.size(); i++){
        //     if(isEqual(searchMe.get(i), target)){
        //         System.out.println("Found target at index " + i);
        //         break;
        //     }
        // }


    }

    public static boolean isEqual(int a, int b){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            // ignroe
        }

        return a == b;

    }

    private static List<Integer> randomList(){
        
        int size = 50_000;
        List<Integer> list = new ArrayList<>(size);


        Random rng = new Random();

        for(int i = 0; i < size; i ++){
            list.add(rng.nextInt(0, 999));
        }

        int target = -1;
        int index = rng.nextInt(0, size);

        System.out.println("Placing the -1 at index " + index);

        list.set(index, target);

        return list;

    }
}