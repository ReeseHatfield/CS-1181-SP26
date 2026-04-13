public class CustomThread extends Thread {

    private int start;
    private int end;

    private int sum;

    public int getSum() {
        return sum;
    }

    public CustomThread(int start, int end){


        System.out.println(super.getName());
        this.start = start;
        this.end = end;
    }

    @Override
    public void run(){  
        for(int i = start; i < end; i ++){
            this.sum += i;
        }
        // System.out.println("Hello world from thread");
    }
}