public class ThreadIntro
{
    public static void main(String[] args) throws InterruptedException
    {
        final int NUM_THREADS = 2;
        long countTo = 947293;
        CustomThread[] threads = new CustomThread[NUM_THREADS];
        long blockSize = countTo / NUM_THREADS;

        long start = System.currentTimeMillis();

        for (int i = 0; i < NUM_THREADS; i++)
        {
            threads[i] = new CustomThread(i+1, blockSize * i, blockSize * (i + 1));
            threads[i].start();
        }

        for (CustomThread ct : threads)
        {
            ct.join();
        }

        long end = System.currentTimeMillis();

        System.out.println("TOTAL TIME: " + (end - start));
//        CustomThread ct1 = new CustomThread(1, 1, 947293789);
//        ct1.start();
    }
}
