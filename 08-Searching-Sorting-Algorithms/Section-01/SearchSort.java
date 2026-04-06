import java.util.ArrayList;
import java.util.Arrays;

public class SearchSort
{
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 8, 1, 9, 5, 8, 23, -5, 6));
        bubbleSort(nums);
    }

    public  static <E extends Comparable<E>> boolean bubbleSort(ArrayList<E> list)
    {
        boolean dealWithLater = true;
        while (dealWithLater)
        {
            dealWithLater = false;
            for (int i = 0; i < (list.size() - 1); i++)
            {
                E one = list.get(i);
                E two = list.get(i + 1);
                if (two.compareTo(one) < 0)
                {
                    list.set(i, two);
                    list.set(i + 1, one);
                    dealWithLater = true;
                }
            }
            System.out.println(list);
        }
        return true;
    }
}
