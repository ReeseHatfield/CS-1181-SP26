public class Driver {
    // synchronizes across data access
    private volatile static int counter = 0;
    public static void main(String[] args) throws InterruptedException {
        
        // new Thread(() -> {
        //     for(int i = 0; i < 5; i++){
        //         counter++;

        //         System.out.println("counter: " + counter);

        //         try {
        //             Thread.sleep(100);
        //         } catch (InterruptedException e) {
        //             e.printStackTrace();
        //         }

        //     }
        // }).start();


        // System.out.println("entering loop");
        // boolean running = counter < 5;
        // while (running) {
        //     // System.out.println("blocking...");
        // }
        // System.out.println("exiting loop");

        // System.out.println("Finished main");


        Counter c = new Counter();

        Runnable task = () ->{
            for(int i = 0; i < 100_000; i ++){
                // System.out.println(Thread.currentThread().getState());
                c.increment();
            }
        };

        Thread t1 = new Thread(task);
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());


        Thread t2 = new Thread(task);
        t2.start();

        
        t1.join();
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        t2.join();

        System.out.println(t1.getState());
        System.out.println(t2.getState());

        Thread t3 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t3.start();


            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println("t3 state: " + t3.getState());


        System.out.println("Value: " + c.getValue());

    }
}