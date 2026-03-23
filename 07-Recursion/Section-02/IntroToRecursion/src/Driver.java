import java.io.File;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        // try {
        //     foo();
        // }
        // catch(Exception e){
        //     e.printStackTrace();
        // }


        doThing(0);
    }


    public static void doThing(int timesRan){
        // does something
        
        if(timesRan >= 3){
            return;
        }
        
        
        System.out.println("Do thing was ran");
        doThing(timesRan + 1);
    }


    public static int countOccurrences(String s, char c){

        
        return 0;
    }



    public static void foo() throws Exception{
        bar();
    }

    public static void bar() throws Exception{
        // throw new RuntimeException();

        new Scanner(new File("doesnt exist"));
    }
}