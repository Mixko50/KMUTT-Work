package LOL;

public class circularDoublyLinkedList {

    SLLnode head;
    SLLnode tail;

    public circularDoublyLinkedList() {
        head = null;
        tail = null;
    }

    public void addToTail(int v) {
        if (head == null) {
            tail = head = new SLLnode(v);
            tail.next = head;
            tail.prev = head;
        } else {
            tail.next = new SLLnode(v,head,tail);
            tail = tail.next;
            head.prev = tail;
        }
    }
}
