public class CustomLinkedList {

    private static class Node{
        String data;
        Node next;
    }

    private Node head;
    

    public CustomLinkedList(){

        this.head = null;
    }

    public void foo(){
        Node cur = this.head;

        while(cur != null){

            System.out.println(cur.data);

            cur = cur.next;
        }
    }



}
