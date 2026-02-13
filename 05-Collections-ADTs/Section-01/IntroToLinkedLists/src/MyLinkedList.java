public class MyLinkedList<T> {
    private Node<T> head = null;


    public void add(T thingToAdd){
        Node<T> addMe = new Node<>(thingToAdd);

        if(this.head == null){
            this.head = addMe;
            return;
        }

        Node<T> cur = this.head;
        while(cur.next != null){
            cur = cur.next;
        }

        // once we get here
        // cur should be the last non-null elem

        cur.next = addMe;

    }

    public void printList(){
        Node<T> cur = this.head;

        while(cur != null){
            System.out.println(cur.data);
            cur = cur.next;
        }


    }

    public T get(int index){

        Node<T> cur = this.head;
        for(int i = 0; i < index; i ++){
            cur = cur.next;
        }
        // cur should be moved to the correct index

        return cur.data;

    }

    // remove the first 
    //  naive implementation
    public void remove(T thingToRemove){

        // guard clause 

        // special case
        // early return
        if(this.head.data.equals(thingToRemove)){
            this.head = this.head.next;
            return;
        }


        // happy path


        Node<T> cur = this.head;


        while(!cur.next.data.equals(thingToRemove)){
            System.out.println("cur " + cur.data);
            System.out.println("cur.next " + cur.next.data);
            cur = cur.next;
        }

        System.out.println("reassigning pointers");

        cur.next = cur.next.next;
    }
}
