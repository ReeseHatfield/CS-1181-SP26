// Prints anything. Where the type of anything can only be a number
public class NumberPrinter<T extends Number> {
    public void printThing(T anything){

        System.out.println(anything);
    }

}
