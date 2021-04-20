package LOL;

public class SLLnode {

    int value;
    SLLnode next;
    SLLnode prev;

    public SLLnode(int value, SLLnode next, SLLnode prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    public SLLnode(int value, SLLnode next) {
        this.value = value;
        this.next = next;
    }
    public SLLnode(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public SLLnode getNext() {
        return next;
    }

    public void setNext(SLLnode next) {
        this.next = next;
    }
}
