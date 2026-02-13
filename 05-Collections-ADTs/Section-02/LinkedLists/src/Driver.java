import java.util.*;

public class Driver {
    public static void main(String[] args) {
        // List<String> list = new LinkedList<>();

        // ArrayList<String> temp = new ArrayList<>();

        // list.add("Hello");
        // list.add("World");

        // System.out.println(list);


        // Node<String> n0 = new Node<>("Alice");
        
        // Node<String> n1 = new Node<>("Bob");
        // n0.next = n1;
        
        // Node<String> n2 = new Node<>("Charlie");
        // n1.next = n2;

        // n2.next = null;



        // Node<String> current = n0;
        // while(current != null){

        //     System.out.println(current.data);

        //     current = current.next;
        // }


        // // init; conditional; modification
        // for(int i = 0; i < 10; i ++){

        // }

        // System.out.println();
        // for(Node<String> cur = n0; cur != null; cur = cur.next){
        //     System.out.println(cur.data);
        // }




        MyLinkedList<String> ll = new MyLinkedList<>();

        ll.add("Alice");
        ll.add("Bob");
        ll.add("Charlie");
        ll.add("Derek");
        ll.add("Eli");


        
        // ll.printList();

        ll.insertAtIndex(1, "Reese");

        // ll.remove("Alice");
        ll.printList();

        System.out.println();
        System.out.println();

        Stack<String> myStack = new Stack<>();

        myStack.push("Hello");
        myStack.push("World");
        myStack.push("My");
        myStack.push("Name");
        myStack.push("is");
        myStack.push("Reese");


        String temp = myStack.pop();




        System.out.println(myStack.peek());

        System.out.println(myStack);

        while(!myStack.isEmpty()){
            System.out.println(myStack.pop());
        }

        System.out.println("Printing the stack: " + myStack);

    }
}