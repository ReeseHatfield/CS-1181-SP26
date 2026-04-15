public class Counter {
    private volatile int value = 0;

    public synchronized void increment(){
        int cur = value;

        cur = cur + 1;

        this.value = cur;
    }

    public int getValue(){
        return this.value;
    }
}
