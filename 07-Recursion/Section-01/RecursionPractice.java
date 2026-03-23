public class RecursionPractice
{
    public static void main(String[] args)
    {
        System.out.println(reverseWord(""));
        System.out.println(countEvens("1"));
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

    public static int isEven(int num)
    {
        if (num % 2 == 0)
        {
            return 1;
        }
        return 0;
    }
}
