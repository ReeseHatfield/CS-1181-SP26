import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageThread extends Thread {
    
    private File copy;
    private int id;
    private ArrayList<Integer> list = new ArrayList<>();
    private double average = 0;
    
    public AverageThread(File f, int id) throws FileNotFoundException{
        this.copy = f;
        this.id = id;


        Scanner scnr = new Scanner(copy);

        while(scnr.hasNextLine()){
            String line = scnr.nextLine();
            
            this.list.add(Integer.parseInt(line.trim()));
        }

        scnr.close();

    }

    @Override
    public void run(){

        // note: watch for int division here
        int chunkSize = list.size() / Driver.numThreads;


        // watch for last value in project
        int start = this.id * chunkSize;
        int end = start + chunkSize;

        System.out.println(start);
        System.out.println(end);

        ArrayList<Integer> portion = new ArrayList<>(list.subList(start, end));

        int sum = 0;
        for(int i = 0; i < portion.size(); i ++){
            sum += portion.get(i);
        }

        double mean = sum / (double) portion.size();
        System.out.println("mean: " + mean);
        this.average = mean;
        // System.out.println(list);
    }

    public double getAverage(){
        return this.average;
    }
}
