public class ThreadIntro
{
    public static void main(String[] args)
    {
        final int NUM_THREADS = 1;
        long countTo = 947293;
        CustomThread[] threads = new CustomThread[NUM_THREADS];
        long blockSize = countTo / NUM_THREADS;

        for (int i = 0; i < NUM_THREADS; i++)
        {
            threads[i] = new CustomThread(i+1, blockSize * i, blockSize * (i + 1));
            threads[i].start();
        }
//        CustomThread ct1 = new CustomThread(1, 1, 947293789);
//        ct1.start();
    }
}
