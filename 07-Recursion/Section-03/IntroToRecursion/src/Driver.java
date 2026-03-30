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


        // for(int i = 0; i < 100; i ++){
            
        //     System.out.println(fibN(i));
        // }

        // System.out.println(endX("xx__java_dev__xx", 0));

        printTriangle(30);

        // System.out.println(appendXs("Reese", 3));
    }

    public static void printTriangle(int height){
        if(height == 0){
            return;
        }

        printChars('*', height);
        System.out.println();

        printTriangle(height - 1);
    }

    public static void printChars(char c,  int charsLeft){
        if(charsLeft <= 0){
            return;
        }

        System.out.print(c + " ");
        printChars(c, charsLeft - 1);
    }


    public static String removeX(String input){

        // entirely without loops
        // base case 
        if(input.isEmpty()){
            return "";
            // return input;
        }

        
        char first = input.charAt(0);
        String remaining = input.substring(1);

        if(first == 'x'){
            // recursive step
            return removeX(remaining);
        }
        else {

            // recursive step
            // recombining 
            return first + removeX(remaining);
        }

    }

    public static String endX(String input){
        if(input.isEmpty()){

            // "e" -> "e"
            // "x" -> "x"
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

    // int foundXs
    // iterate thru the string
    // count up and remove all the xs
    // after iteration, append that many xs

    public static String endX(String input, int foundXs){

        if(input.isEmpty()){

            // for(int i = 0; i < foundXs; i ++){
            //     input += "x";
            // }

            input = appendXs(input, foundXs);

            return input;
        }

        if(input.charAt(0) == 'x'){
            return endX(input.substring(1), foundXs + 1);
        }
        else {
            return input.charAt(0) + endX(input.substring(1), foundXs);
        }

    }

    public static String appendXs(String input, int xsLeft){
        if(xsLeft <= 0){
            return input;
        }

        return appendXs(input + "x", xsLeft - 1);
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