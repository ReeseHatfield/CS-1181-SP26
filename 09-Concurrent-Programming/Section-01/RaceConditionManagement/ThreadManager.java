public class ThreadManager
{
    private int[] work = {4, 8, 14, 8, 9, 3, 6, 1, 5, 11, 2};
    private int nextJob = 0;

    public synchronized int getNextJob()
    {
        int jobWorkIndex = -1;

        try
        {
            Thread.sleep(1);
        }
        catch (InterruptedException ie)
        {
            System.out.println("oops");
        }

        if (hasNextJob())
        {
            jobWorkIndex = nextJob;
            nextJob++;
        }

        return jobWorkIndex;
    }

    public void doWork(int jobIndex, int threadID)
    {
        System.out.println("THREAD #" + threadID + " started job " + jobIndex);
        try
        {
            Thread.sleep(500 * work[jobIndex]);
        }
        catch (InterruptedException ie)
        {
            System.out.println("uh oh!");
        }
        System.out.println("THREAD #" + threadID + " finished job " + jobIndex);
    }

    public boolean hasNextJob()
    {
        return nextJob < work.length;
    }
}
