import java.util.*;

/**
 * A list of logs that you cannot remove from
 */
public class LogList {

    //form encapulate

    // more generally talking about abstraction
    private ArrayList<String> internalList = new ArrayList<>();


    /**
     * Adds a log to the list
     * @param logToAdd the log to add to the list
     */
    public void addLog(String logToAdd){
        this.internalList.add(logToAdd);
    }

    /**
     * Prints every other item in the list
     */
    public void printEveryOther(){
        for(int i = 0; i < this.internalList.size(); i += 2){
            System.out.println(this.internalList.get(i));
        }
    }
}