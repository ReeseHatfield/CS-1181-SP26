import java.util.*;

public class Searcher extends Thread {
    private List<Integer> portion;
    private int id;
    private int target;
    private static volatile boolean foundTarget = false;

    public Searcher(List<Integer> portion, int id, int target){
        this.portion = portion;
        this.id = id;
        this.target = target;
    }



    @Override
    public void run(){
        for(int i = 0; i < portion.size() && !foundTarget; i++){

            
            
            if(Driver.isEqual(portion.get(i), target)){
                //except on the last thread
                int chunkSize = this.portion.size();

                int startOnMyThread = this.id * chunkSize;


                System.out.println("On thread: " + this.id);
                System.out.println("Found target at index " + (startOnMyThread + i));
                foundTarget = true;
            }
        }
    }
}
