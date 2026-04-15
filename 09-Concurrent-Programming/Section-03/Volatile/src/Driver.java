public class Driver {
    
    private static volatile int globalVarCounter = 0;

    // private static volatile boolean hasFoundPassword
    public static void main(String[] args) throws InterruptedException{

        new Thread(() -> {
            for(int i = 0; i < 5; i ++){
                globalVarCounter++;

                System.out.println("Counter: " + globalVarCounter);

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        System.out.println("Entering blocking loop");
        while(globalVarCounter < 5){
            //blocking the main thread
        }
        System.out.println("Exiting blocking loop");

        System.out.println("Finished end of main");
// ------------------------------------------------------

        Counter c = new Counter();

        Runnable task = () -> {
            for(int i = 0; i < 100_000; i ++){
                c.increment();
            }
        };

        Thread t1 = new Thread(task);
        t1.start();

        Thread t2 = new Thread(task);


        t2.start();



        t1.join();
        t2.join();

        System.out.println("value: " + c.getValue());


        Thread t3 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(t3.getState());
        t3.start();
        System.out.println(t3.getState());


        Thread.sleep(500);
        System.out.println(t3.getState());
        
        t3.join();

        System.out.println(t3.getState());

        // t3.start();



        Thread t4 = new Thread(task);

        t4.join();
        
        System.out.println(c.getValue());


    }
}