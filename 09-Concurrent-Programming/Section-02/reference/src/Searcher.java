import java.util.ArrayList;

public class Searcher extends Thread {

    private ArrayList<Integer> portion;
    private int target;
    private int id;


    private static volatile boolean foundTarget = false;

    public Searcher(ArrayList<Integer> portion, int target, int id){
        this.portion = portion;
        this.target = target;
        this.id = id;
    }

    @Override
    public void run(){
        for(int i = 0; i < portion.size() && !foundTarget; i++){
            if(Driver.isEqual(this.target, portion.get(i))){
                System.out.println("Found target!");
                System.out.println("Index: " + i);
                System.out.println("Thread: " + this.id);
                foundTarget = true;
            }
        }
    }
}