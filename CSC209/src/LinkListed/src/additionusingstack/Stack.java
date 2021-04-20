package additionusingstack;

public class Stack {
    int[] s;
    int size;

    public Stack(int capacity){
        s = new int[capacity];
        size = 0;
    }

    public void push (int newData){
        s[size] = newData;
        size++;
    }

    public int pop() {
        size--;
        return (s[size]);
    }

    public void clear() {
        size = 0;
    }

    public boolean isEmpty(){
        return (size<=0);
    }

    public int topElement() {
        return s[size]-1;
    }
}
