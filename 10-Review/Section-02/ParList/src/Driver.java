import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        List<Integer> myList = readNums();

        System.out.println(myList);

        // myList.applyFunc()

        ParList<Integer> myParList = new ParList<>(myList);
        
        ArrayList<Integer> newList = myParList
            .applyFunc((e) -> e * 2)
            .applyFuncPar(e -> e + 1)
            // .applyFunc(e -> e / 2)
            .toList();

        System.out.println(newList);
    }


    private static List<Integer> readNums() {
        List<Integer> list = new ArrayList<>();

        try (Scanner scnr = new Scanner(new File("nums.txt"))) {
            while(scnr.hasNext()){
                Integer cur = Integer.parseInt(scnr.nextLine().trim());
                list.add(cur);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return list;
    }
}
