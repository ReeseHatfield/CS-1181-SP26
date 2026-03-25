import java.util.Scanner;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
        // try {
        //     foo();
        // }catch (Exception e){
        //     e.printStackTrace();
        // }

        // System.out.println(Counter.countOccurrences("Hellolololooo", 'h'));


        for(int i = 0; i < 100; i ++){
            
            System.out.println(fibN(i));
        }
    }

    /**
     * 
     * @param timesRans
     * @return Nth fib. number
     */
    public static int fibN(int n){

        if(n == 0){
            return 1;
        }

        if(n == 1){
            return 1;
        }

        return fibN(n - 1) + fibN(n - 2);
    }

    // cur
    // prev
    // prevprev
    // cur + prev + prevprevious
    


    




    public static void doThing(int timesRans){
        // do anything

        if(timesRans > 3) {
            return;
        }

        // for(int i = 0; i < 20; i ++){
        //     System.out.println("i");
        // }

        System.out.println(timesRans);

        doThing(timesRans + 1);

    }

    public static void foo()throws FileNotFoundException{
        bar();
    }

    public static void bar()throws FileNotFoundException{
        baz();
    }

    public static void baz() throws FileNotFoundException{
        // throw new RuntimeException();

        new Scanner(new File("does not exist"));
    }
}