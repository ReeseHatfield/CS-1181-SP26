public class Driver {


    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();


        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 100_000; i ++){
                c.increment();
            }
        });
        
        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 100_000; i ++){
                c.increment();
            }
        });

        t1.start();
        t2.start();


        t1.join();
        t2.join();

        System.out.println(c.getValue());

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                
                counter++;
                System.out.println("Writer: counter = " + counter);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
            }
        }).start();

        while (counter < 5) {
            // System.out.println("Blocking...");
        }

        System.out.println("Reader: counter = " + counter);
    }
}