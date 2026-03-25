import java.util.Scanner;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
        // try {
        //     foo();
        // }catch (Exception e){
        //     e.printStackTrace();
        // }

        doThing(0);
    }


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