// import java.util.List;
// 
public class MyLinkedList<T> {
    private Node<T> head = null;

    private int size;

    public T getFirst(){
        return this.head.data;
    }

    public void add(T thingToAdd){

        Node<T> addMe = new Node<>(thingToAdd);
        this.size++;

        // edge case where the head is null
        if(this.head == null){
            this.head = addMe;
            return;
        }


        // some form of general case
        Node<T> cur = this.head;
        while(cur.next != null){
            cur = cur.next;
        }

        cur.next = addMe;

    }


    public T get(int index){

        Node<T> cur = this.head;

        for(int i = 0; i < index; i++){
            cur = cur.next;
        }

        return cur.data;
    }


    public void printList(){

        Node<T> cur = this.head;
        while(cur != null){
            System.out.println(cur.data);
            
            cur = cur.next;
        }
    }

    // public int size(){
        
    //     int size = 0;

    //     Node<T> cur = this.head;
    //     while(cur != null){
            
    //         size++;
    //         cur = cur.next;
    //     }

    //     return size;
    // }

    public int size(){
        return this.size;
    }


    // NOTE did not handle end removal
    // Exercise to the reader
    public void remove(T removeMe){

        // guard clause
        if(this.head.data.equals(removeMe)){
            this.head = this.head.next;
            return;
        }

        
        // happy path
        Node<T> cur = this.head;
        while(!cur.next.data.equals(removeMe)){
            cur = cur.next;
        }

        cur.next = cur.next.next;


    }


}
