import java.util.ArrayList;
import java.util.List;

public class MyThread extends Thread
{
    private int threadID = 0;
    private int maxValue = -1;
    private List<Integer> searchSpace = new ArrayList<>();

    public MyThread(int id, List<Integer> space)
    {
        threadID = id;
        searchSpace = space;
    }

    @Override
    public void run()
    {
        for (int currVal : searchSpace)
        {
            if (currVal > maxValue)
            {
                maxValue = currVal;
            }
        }
    }

    public int getMaxValue()
    {
        return maxValue;
    }
}
