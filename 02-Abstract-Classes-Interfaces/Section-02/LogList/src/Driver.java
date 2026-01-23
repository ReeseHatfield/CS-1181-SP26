import java.util.*;

public class Driver {
    public static void main(String[] args){

        // ArrayList<String> newList = new LogList();

        LogList ll = new LogList();

        ll.addLog("event 1");
        ll.addLog("event 2");
        ll.addLog("event 3");
        ll.addLog("event 4");
        ll.addLog("event 5");
        ll.addLog("event 6");


        // ll.remove("event 2");
        ll.printEveryOther();
    }
}