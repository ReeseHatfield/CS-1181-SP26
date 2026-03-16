import javax.swing.JPanel;

public class Driver {
    public static void main(String[] args){

        int curBest = 999999999;

        for(int i = 0; i < 100; i ++){
            if (runSim(i) < curBest){
                curBest = runSim(i);
            }
        }

        System.out.println(curBest);
        
    }
    
    public static int runSim(int percentage){
        FontAdjuster.adjustFontSize(20);
    
    
        Calculator c = new Calculator("My first GUI calc.");

        return 9;

    }
}