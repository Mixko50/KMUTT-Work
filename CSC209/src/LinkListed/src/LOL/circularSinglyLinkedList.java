package LOL;

public class circularSinglyLinkedList {

    SLLnode head , tail;


    public circularSinglyLinkedList() {
        head = null;
        tail = null;
    }

    public void addTotail(int v){
        if (head == null){
            tail = head = new SLLnode(v);
            tail.next = head;
        } else {
            tail.next = new SLLnode(v ,head);
            tail = tail.next;
        }
    }
}
