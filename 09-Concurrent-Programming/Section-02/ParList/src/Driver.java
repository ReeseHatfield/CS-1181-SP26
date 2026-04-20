import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        // System.out.println(Runtime.getRuntime().totalMemory());


        List<Integer> list = readNums();

        ParList<Integer> parList = new ParList<>(list);

        List<Integer> newList = parList
            .applyFunc(e -> e * 2)
            .applyFunc(e -> e + 1)
            .applyFunc((e) -> {
                System.out.println(e);

                return e;
            })
            .applyFuncPar(e -> e / 2)
            .toList();


        System.out.println();
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