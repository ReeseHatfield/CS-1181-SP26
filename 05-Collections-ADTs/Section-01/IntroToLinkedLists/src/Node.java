// TODO encapsulate entirely within LinkedList class
public class Node<T> {
    T data;
    Node<T> next;

    public Node(T data){
        this.data = data;
        // this.next = next;
    }

    // public boolean hasNext(){
    //     if(this.next == null){
    //         return false;
    //     }
    //     else {
    //         return true;
    //     }
    // }
}
