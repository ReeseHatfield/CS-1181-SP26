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


        // for(int i = 0; i < 100; i ++){

        //     System.out.println(fibN(i));
        // }


        // System.out.println(endX("xReexsxex", 0));

        printTriangle(30);

    }

    public static void printTriangle(int height){
        // base case

        if(height == 1){
            System.out.println("*");
            return;
        }

        // work
        printChars('*', height);
        System.out.println();

        // simplifciation step
        printTriangle(height - 1);
    }


    public static void printChars(char c, int charsLeft){
        if(charsLeft <= 0){
            return;
        }

        System.out.print(c + " ");

        printChars(c, charsLeft - 1);
    }



    public static String removeX(String input){
        // not use any kind of loops
        // "" -> ""
        if(input.isEmpty()){
            return input;
        }

        char first = input.charAt(0);
        String remaining = input.substring(1);

        if(first == 'x'){
            return removeX(remaining);
        }
        else {
            // recombination
            return first + removeX(remaining);
        }
    }

    public static String endX(String input){

        if(input.isEmpty()){
            return input;
        }

        char first = input.charAt(0);
        String remaining = input.substring(1);

        if(first == 'x'){
            return endX(remaining) + first;
        }
        else {
            return first + endX(remaining);
        }


    }

    public static String endX(String input, int foundXs){
        if(input.length() == 0){
            
            // "e" -> "e"
            // "x" -> "x" 

            // for(int i = 0; i < foundXs; i++){
            //     input += "x";
            // }



            return appendX(input, foundXs);
            
        }

        if(input.charAt(0) == 'x'){
            return endX(input.substring(1), foundXs + 1);
        }
        else {
            return input.charAt(0) + endX(input.substring(1), foundXs);
        }


    }

    public static String appendX(String input, int xsToAppend){
        if(xsToAppend <= 0){
            return input;
        }

        return appendX(input, xsToAppend - 1) + 'x';
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