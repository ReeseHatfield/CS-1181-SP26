import java.util.ArrayList;
import java.util.List;

import javax.swing.Timer;

public class Driver {
    public static void main(String[] args) throws InterruptedException {
        // runnable interface
        // lets you pass procedures
        // as tho they are data
        // String name = "Reese";
        // Runnable r = () -> { System.out.println("Hello " + name); };
        // Thread t = new Thread(r);
        // t.start();



        // r.run();

        List<CustomThread> threads = new ArrayList<CustomThread>();
        for(int i = 0; i < 3; i ++){
            threads.add(new CustomThread(0, i * 10));
            threads.get(i).start();
        }


        // thread it was called FROM
        // thread it was called ON
        for(int i = 0; i < 3; i ++){
            threads.get(i).join();
        }

        int totalSum = 0;
        // totalSum += c2.getSum();
        // totalSum += c3.getSum();
        
        for(int i = 0; i < 3; i ++){
            
            totalSum += threads.get(i).getSum();
        }


        System.out.println("Total Sum was: " + totalSum);

// Source - https://stackoverflow.com/q/12600861
// Posted by Ameet, modified by community. See post 'Timeline' for change history
// Retrieved 2026-04-10, License - CC BY-SA 3.0

        Thread t = Thread.currentThread();
        t.setName("test");
        System.out.println(t.getName());

    }
}