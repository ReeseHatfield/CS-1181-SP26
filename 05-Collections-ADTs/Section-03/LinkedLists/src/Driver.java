import java.util.*;

public class Driver {
    public static void main(String[] args){
        int[] arr = new int[5];
        int[] arr1 = {1, 2  };



        List<String> l1 = new LinkedList<>();

        l1.add("hello");
        l1.add("hello");
        l1.add("hello");
        l1.add("hello");
        l1.add("hello");
        l1.add("hello");
        l1.add("hello");
        l1.add("hello");
        l1.add("hello");
        l1.add("hello");

        l1.get(0);


        Node<String> n0 = new Node<>("Alice");
        
        Node<String> n1 = new Node<>("Bob");
        n0.next = n1;
        
        Node<String> n2 = new Node<>("Charlie");
        n1.next = n2;

        n2.next = null;


        // System.out.println(n0.next.next.data);

        for(int i = 0; i < 10; i ++){

        }


        Node<String> current = n0;
        while(current != null){

            System.out.println(current.data);

            current = current.next;
        }




        // initialize; conditional; modification
        for(int i = 0; i < 10; i ++){

        }

        System.out.println();

        for(Node<String> cur = n0; cur != null; cur = cur.next){
            System.out.println(cur.data);
        }


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        MyLinkedList<String> ll = new MyLinkedList<>();

        ll.add("Alice");
        ll.add("Bob");
        ll.add("Charlie");
        ll.add("Derek");
        ll.add("Eli");

        // ll.printList();

        ll.remove("Hello");

        ll.printList();
        // ll.remove("Charlie");

        // System.out.println(ll.get(4));


        // Node<Integer> n3 = new Node<>(5);

    }
}