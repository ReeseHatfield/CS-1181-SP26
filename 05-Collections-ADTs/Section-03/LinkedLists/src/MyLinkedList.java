public class MyLinkedList<T> {

    private Node<T> head;
    private int size = 0;


    public void add(T thingToAdd){
        // allocate new memory
        Node<T> addMe = new Node<>(thingToAdd);
        this.size++;

        if(this.head == null){
            this.head = addMe;
            return;
        }


        // not allocating memory = no use of NEW keyword
        Node<T> cur = this.head;
        while(cur.next != null){

            cur = cur.next;
        }
        // by the time this ends
        // cur is the last elem.

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

        for(int i = 0; i < index; i++){
            cur = cur.next;
        }

        return cur.data;
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

    //  does not account for missing values
    // exercise to the reader
    public void remove(T thingToRemove){
        // guard clause 
        if(this.head.data.equals(thingToRemove)){
            this.head = this.head.next;
            return;
        }


        // more generally, happy path
        Node<T> cur = this.head;

        while(!cur.next.data.equals(thingToRemove)){
            cur = cur.next;
        }

        // once that runs
        // cur = one place before thing to remove

        cur.next = cur.next.next;

    }


    public void insertAtIndex(int index, T thingToAdd){
        Node<T> addMe = new Node<>(thingToAdd);

        if(index == 0){

            addMe.next = this.head;

            this.head = addMe;

            return;
        }

        Node<T> cur = this.head;

        for(int i = 0; i < index - 1; i ++){
            cur = cur.next;
        }


        // cur.next = addMe;

        addMe.next = cur.next;

        cur.next = addMe;



    }
}
