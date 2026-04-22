import java.util.*;
public class Driver{

    public static void main(String[] args) {
        List<Integer> list0 = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();

        System.out.println(parenBit(" aksdjk a(hello) as"));
        System.out.println(parenBit(" aksdjk a() as"));


        System.out.println(parenBit("xyz(abc)123"));
        System.out.println(parenBit("x(hello)"));
        System.out.println(parenBit("(xy)1"));

    }


    // 1. Base case
    public static String parenBit(String str){
        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);

        if(first == '(' && last == ')'){
            return str;
        }
        else if(first == '(' && last != ')'){

            String trimmed = str.substring(0, str.length() - 1);

            return parenBit(trimmed);
        }
        else if (first != '(' && last == ')') {
            String trimmed = str.substring(1, str.length());

            return parenBit(trimmed);
        }
        else {
            String trimmed = str.substring(1, str.length() - 1);

            return parenBit(trimmed);
        }
    }
}