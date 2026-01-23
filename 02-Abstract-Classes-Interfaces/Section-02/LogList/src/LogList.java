import java.util.*;

/**
 * A list of logs that cannot be removed
 */
public class LogList {
    
    // this is encapsulation 
    private ArrayList<String> internalList = new ArrayList<>();


    /**
     * Adds a log to the list
     * @param newLog new log to add
     */
    public void addLog(String newLog){
        internalList.add(newLog);
    }


    /**
     * Prints every other log item
     */
    public void printEveryOther(){
        for(int i = 0; i < internalList.size(); i+= 2){
            System.out.println(internalList.get(i));
        }
    }
}
