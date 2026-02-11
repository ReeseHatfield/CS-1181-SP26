import java.util.*;

public class Driver {
    public static void main(String[] args){
        int[] arr = new int[5];

        int[] arr2 = {1, 2, 3, 4 , 5};

        ArrayList<Integer> list = new ArrayList<>(150);



        // List<String> l1 = new ArrayList<>();

        // l1.add("alice");
        // l1.add("bob");
        // l1.add("chalie");

        // System.out.println(l1);

        
        // Node<String> temp = n0;
        
        Node<String> n0 = new Node<>("Alice");

        Node<String> n1 = new Node<>("Bob");
        n0.next = n1;

        Node<String> n2 = new Node<>("Charlie");
        n1.next = n2;

        n2.next = null;

        
        
        Node<String> cur = n0;
        while(cur != null){
            System.out.println(cur.data);
            
            cur = cur.next;
        }
        
        // cannot do this bc of the generic param
        // Node<Integer> n3 = new Node<Integer>(5);
        // n2.next = n3;
        
        // initialize; conditional; modification
        for(int i = 0; i < 10; i++){
            //arr.get(i)
            //arr[i]
        }

        System.out.println();
        System.out.println();
        System.out.println();

        // for(Node<String> temp = n0; temp != null; temp = temp.next){
        //     System.out.println(temp.data);
        // }

        

    }
}