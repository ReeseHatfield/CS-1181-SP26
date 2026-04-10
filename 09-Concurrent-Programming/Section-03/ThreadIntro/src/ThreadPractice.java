import java.util.*;

public class ThreadPractice
{
    public static void main(String[] args) throws InterruptedException
    {
        Random rng = new Random();
        final int NUM_THREADS = 1;
        MyThread[] threads = new MyThread[NUM_THREADS];

        ArrayList<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < 99999999; i++)
        {
            randomNumbers.add(rng.nextInt(10000));
        }

        System.out.println("LIST GENERATED");

        int blockSize = randomNumbers.size() / NUM_THREADS;
        for (int i = 0; i < NUM_THREADS; i++)
        {
            threads[i] = new MyThread(i, randomNumbers.subList(i * blockSize, ((i + 1) * blockSize)));
            threads[i].start();
        }

        for (int i = 0; i < NUM_THREADS; i++)
        {
            threads[i].join();
        }

        int trueMax = threads[0].getMaxValue();
        for (int i = 1; i < NUM_THREADS; i++)
        {
            int currMax = threads[i].getMaxValue();
            if (currMax > trueMax)
            {
                trueMax = currMax;
            }
        }

        System.out.println("The max value is " + trueMax);
//        Collections.sort(randomNumbers);
//        System.out.println(randomNumbers.getLast());
    }
}
