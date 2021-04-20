package HeapLab;

public class HeapDataStructureLab {
    public static void main(String[] args) {
        Heap h1 = new Heap(50);
        h1.enqueue(30); h1.enqueue(55);
        h1.enqueue(320); h1.enqueue(20);
        h1.enqueue(400);
        h1.enqueue(100); h1.enqueue(600);

        h1.printAll();
        int topValue = h1.dequeue();
        h1.dequeue();
        System.out.println("\n"+"Top value : "+topValue);
        h1.printAll();
    }
}
