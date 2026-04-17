public class WorkerThread extends Thread
{
    private ThreadManager boss;
    private int id = 0;

    public WorkerThread(ThreadManager tm, int id)
    {
        boss = tm;
        this.id = id;
    }

    @Override
    public void run()
    {
        int job = 0;

        while(boss.hasNextJob())
        {
            job = boss.getNextJob();
            boss.doWork(job, id);
        }
    }
}
