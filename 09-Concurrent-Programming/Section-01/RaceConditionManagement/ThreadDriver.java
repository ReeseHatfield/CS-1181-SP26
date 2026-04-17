import java.util.ArrayList;

public class ThreadDriver
{
    public static final int NUM_THREADS = 4;

    public static void main(String[] args)
    {
        ThreadManager boss = new ThreadManager();
        ArrayList<WorkerThread> employees = new ArrayList<>();

        for (int i = 1; i <= NUM_THREADS; i++)
        {
            employees.add(new WorkerThread(boss, i));
            employees.get((i-1)).start();
        }

    }
}
