import java.util.*;

public class Searcher extends Thread {
    private List<Integer> portion;
    private int target;
    private int id;

    private static volatile boolean foundTarget = false;

    public Searcher(List<Integer> portion, int target, int id){
        this.portion = portion;
        this.target = target;
        this.id = id;
    }

    @Override
    public void run(){

        for(int i = 0; i < this.portion.size() && !foundTarget; i++){
            if(Driver.isEqual(portion.get(i), target)) {
                
                // not on last thread sometimes
                int chunkSize = this.portion.size();
                
                int startOnMyThread = this.id * chunkSize;
                
                System.out.println( "Thread " + this.id + " found it at index " + (i + startOnMyThread));
                
                
                Searcher.foundTarget = true;
            }
        }

    }
}
