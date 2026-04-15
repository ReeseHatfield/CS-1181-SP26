public class Counter {
    private int value = 0;

    // wait for all other threads to finish, before cur thread can call this method
    public synchronized void increment(){

        int cur = this.value;
        cur++;
        this.value = cur;
    }

    public int getValue(){
        return this.value;
    }
}
