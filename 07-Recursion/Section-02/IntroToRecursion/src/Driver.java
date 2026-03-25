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


        // doThing(0);
        // int occurrences = CountOccurrences.countOccurrences("null", 'l');

        // System.out.println(occurrences);


        for(int i = 0; i < 100; i ++){

            System.out.println(fibN(i));
        }

    }

    // 1 1 2 3 5 ...

    public static int fibN(int n){
        if(n == 0){
            return 1;
        }

        if (n == 1){
            return 1;
        }


        return fibN(n - 1) + fibN(n - 2);


    }

    


    public static void doThing(int timesRan){
        // does something
        
        if(timesRan >= 3){
            return;
        }
        
        
        System.out.println("Do thing was ran");
        doThing(timesRan + 1);
    }


    // public static int countOccurrences(String s, char target){
    //     if(s.isEmpty()){
    //         return 0;
    //     }

    //     char first = s.charAt(0);

        
    //     if(first == target){
    //         return 1 + countOccurrences(s.substring(1), target);
    //     } else {
    //         return 0 + countOccurrences(s.substring(1), target);
    //     }

    // }



    public static void foo() throws Exception{
        bar();
    }

    public static void bar() throws Exception{
        // throw new RuntimeException();

        new Scanner(new File("doesnt exist"));
    }
}