import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TimeDemo {

    public static void main(String[] args) {





        int numInsertions = 500_000;
        
        
        double timeTakenLinkedList = timeInsertAtBegining(new LinkedList<String>(), numInsertions);
        System.out.println("LinkedList took " + timeTakenLinkedList + " for " + numInsertions + " insertions");
        
        double timeTakenArrayList = timeInsertAtBegining(new ArrayList<String>(), numInsertions);
        System.out.println("ArrayList took " + timeTakenArrayList + " for " + numInsertions + " insertions");

        
    }


    public static double timeInsertAtBegining(List<String> l, int numInsertions){

        long startTime = System.currentTimeMillis();

        for(int i = 0; i < numInsertions; i++){

            // insert at index 0
            int index = 0;
            l.add(index, "inserted at index " + index); // prevent string pool caching I think?
        }

        long endTime = System.currentTimeMillis();


        return (endTime - startTime) / 1000.0;

    }
}