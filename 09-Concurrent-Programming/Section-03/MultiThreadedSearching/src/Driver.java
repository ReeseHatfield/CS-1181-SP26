import java.util.*;

public class Driver {
    public static void main(String[] args){
        List<Integer> searchMe = randomList();
        int target = -1;
        // System.out.println(searchMe);

        // for(int i = 0; i < searchMe.size(); i ++){
        //     if(isEqual(searchMe.get(i), target)) {
        //         System.out.println("Found it at index " + i);
        //         break;
        //     }
        // }

        int numThreads = 8;

        ArrayList<Searcher> threads = new ArrayList<>();
        for(int i = 0; i < numThreads; i ++){
            int chunkSize = searchMe.size() / numThreads;

            int start = i * chunkSize;
            int end = start + chunkSize;
            if(i == numThreads - 1){
                end = searchMe.size();
            }

            System.out.println("Thread " + i + " is from " + start + " to " + end);

            List<Integer> portion = new ArrayList<>(searchMe.subList(start, end));

            Searcher cur = new Searcher(portion, target, i);
            threads.add(cur);

            cur.start();

        }

        for(int i = 0; i < numThreads; i++){
            try {
                threads.get(i).join();
            } catch (InterruptedException e) {
                //  ignore
            }
        }

        System.out.println("Finished search");


    }

    public static boolean isEqual(int a, int b){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            // ignore
        }

        return a == b;

    }

    public static List<Integer> randomList(){
        int size = 50_000;
        List<Integer> list = new ArrayList<>(size);

        Random rng = new Random();
        for(int i = 0; i < size; i ++){
            list.add(rng.nextInt(0, 999));
        }

        int target = -1;
        int index = rng.nextInt(0, size);

        System.out.println("Put target at index " + index);
        list.set(index, target);

        return list;
    }
}