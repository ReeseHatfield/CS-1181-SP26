import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageThread extends Thread {

    private File copy;
    private int id; 
    private ArrayList<Integer> list = new ArrayList<>();
    private double mean = 0;

    public AverageThread(File copy, int id) throws FileNotFoundException{
        this.copy = copy;
        this.id = id;

        Scanner scnr = new Scanner(copy);

        while(scnr.hasNextLine()){
            String line = scnr.nextLine();
            int value = Integer.parseInt(line.trim());
            this.list.add(value);
        }

        scnr.close();



    }

    @Override
    public void run(){


        int chunkSize = this.list.size() / Driver.NUM_THREADS;

        int start = this.id * chunkSize;
        // account for the last value being different
        int end = start + chunkSize;


        // System.out.println("Thread " + this.id + " " + start + "-" + end);

        ArrayList<Integer> myPortion = new ArrayList<>(this.list.subList(start, end));
        // System.out.println("On thread + " + id + " " + copy.getName() + list);
    
        int sum = 0;
        for(int i = 0; i < myPortion.size(); i ++){
            sum += myPortion.get(i);
        }

        this.mean = sum / (double) myPortion.size();
        // System.out.println("Thread: " + id + " " + mean);
    }

    public double getAverage(){
        return this.mean;
    }
    
}
