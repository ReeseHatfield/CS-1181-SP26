public class CustomThread extends Thread
{
    private int id = 0;
    private long min = 0;
    private long max = 0;

    public CustomThread(int id, long min, long max)
    {
        this.id = id;
        this.min = min;
        this.max = max;
    }

    @Override
    public void run()
    {
        for (long i = min; i <= max; i++)
        {
            // System.out.println("THREAD #" + id + ": " + i);

            try
            {
                Thread.sleep(250);
            }
            catch (InterruptedException ie)
            {
                System.out.println("ow");
            }
        }
    }
}
