package HeapLab;

public class Heap {
    int[] heap;
    int size;

    public Heap(int maxSize) {
        heap = new int[maxSize];
        size = 0;
    }

    public Heap(){
        this(100);
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == heap.length;
    }

    public void printAll(){
        for (int i = 0 ; i<size ; i++){
            System.out.print(heap[i]+" ");
        }
    }

    public void enqueue(int newValue){
        if (!isFull()){
            heap[size] = newValue;
            int newValueIndex = size;
            int parentIndex = (newValueIndex-1)/2;
            while ( newValueIndex > 0 && heap[newValueIndex] > heap[parentIndex]){
                //move up -> swap value of the new node with its parent
                int temp = heap[parentIndex];
                heap[parentIndex] = heap[newValueIndex];
                heap[newValueIndex] = temp;
                newValueIndex = parentIndex;
                parentIndex = (newValueIndex - 1)/2;
            }
            size++;
        } else {
            System.out.println("The heap is full. No more space.");
        }
    }

    public int dequeue(){
        int maxValue = heap[0];
        int lastElement = heap[size-1];
        heap[0] = lastElement;
        size--;
        int lastElementIndex = 0;
        int leftChildIndex = (lastElementIndex*2)+1;
        int rightChildIndex = (lastElementIndex*2)+2;
        int swapIndex;

        while (heap[lastElementIndex] < heap[leftChildIndex] || ( (rightChildIndex < size) &&  heap[lastElementIndex] < heap[rightChildIndex])){
            //find which child to swap with
            if ( leftChildIndex == size-1){
                swapIndex = leftChildIndex;
            } else {
                if (heap[leftChildIndex] > heap[rightChildIndex]){
                    swapIndex = leftChildIndex;
                } else {
                    swapIndex = rightChildIndex;
                }
            }
            int temp = heap[lastElementIndex];
            heap[lastElementIndex] = heap[swapIndex];
            heap[swapIndex] = temp;
            lastElementIndex = swapIndex;
            leftChildIndex = (lastElementIndex*2)+1;
            rightChildIndex = (lastElementIndex*2)+2;
        }

        return maxValue;
    }
}
