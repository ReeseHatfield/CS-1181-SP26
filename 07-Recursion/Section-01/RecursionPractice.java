import java.util.ArrayList;
import java.util.Arrays;

public class RecursionPractice
{
    public static void main(String[] args)
    {
        System.out.println(reverseWord(""));
        System.out.println(countEvens("1"));

        ArrayList<String> locations = new ArrayList<>(Arrays.asList("school", "zoo", "museum", "mall", "bank"));
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 5, -9, 6, 3, 28, -29, 5, 10));
        ArrayList<Double> gpas = new ArrayList<>();
        System.out.println(findMax(locations));
        System.out.println(findMax(nums));
        System.out.println(findMax(gpas));
    }

    public static String reverseWord(String word)
    {
        // base case
        if (word.length() <= 1)
        {
            return word;
        }
        // recursive step
        else
        {
            String letter = word.substring(0, 1);
            String smallerWord = word.substring(1);
            return reverseWord(smallerWord) + letter;

            // one-line recursive step
            // return reverseWord(word.substring(1)) + word.substring(0, 1);
        }
    }

    public static int countEvens(String num)
    {
        if (num.isEmpty())
        {
            return 0;
        }
        return isEven(Integer.parseInt(num.substring(0, 1))) + countEvens(num.substring(1));

//        int firstNum = Integer.parseInt(num.substring(0, 1));
//        String restOfNum = num.substring(1);
//
//        return isEven(firstNum) + countEvens(restOfNum);
    }

    private static int isEven(int num)
    {
        if (num % 2 == 0)
        {
            return 1;
        }
        return 0;
    }

    public static <I extends Comparable<I>> I findMax(ArrayList<I> items)
    {
        if (items.isEmpty())
        {
            return null;
        }
        else if (items.size() == 1)
        {
            return items.getFirst();
        }

        I firstElement = items.removeFirst();
        I maxElement = findMax(items);
        if (firstElement.compareTo(maxElement) < 0)
        {
            return maxElement;
        }
        return firstElement;
    }
}
