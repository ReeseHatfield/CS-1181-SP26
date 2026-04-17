public class Counter {
    private volatile int value = 0;

    public synchronized void increment(){
        int cur = value;

        // increment value in a synchronized manner
        cur = cur + 1;

        this.value = cur;
    }

    public int getValue(){
        return this.value;
    }
}
