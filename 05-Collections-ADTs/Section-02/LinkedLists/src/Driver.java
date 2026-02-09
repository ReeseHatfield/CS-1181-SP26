import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        // List<String> list = new LinkedList<>();

        // list.add("Hello");
        // list.add("World");

        // System.out.println(list);


        Node<String> n0 = new Node<>("Alice");
        
        Node<String> n1 = new Node<>("Bob");
        n0.next = n1;
        
        Node<String> n2 = new Node<>("Charlie");
        n1.next = n2;

        n2.next = null;



        Node<String> current = n0;
        while(current != null){

            System.out.println(current.data);

            current = current.next;
        }


        // init; conditional; modification
        for(int i = 0; i < 10; i ++){

        }

        // System.out.println();
        // for(Node<String> cur = n0; cur != null; cur = cur.next){
        //     System.out.println(cur.data);
        // }




    }
}