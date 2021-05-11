package AdvancedSorting;

import java.util.LinkedList;
import java.util.Queue;

public class MyData {
    int[] data;
    int size;

    public MyData(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    public void add(int newValue){
        data[size] = newValue;
        size++;
    }

    public void quickSort(int first, int last){
        if (first >= last){
            return;
        }
        int lower = first+1, middle, upper=last;
        int pivot = data[first];
        while (lower <= upper){
            while (lower < upper && data[lower] < pivot){
                lower++;
            } // lower found a number that is bigger than pivot

            while (lower <= upper && data[upper] >= pivot){
                upper--;
            } // upper found a number that is smaller than pivot

            if (lower < upper){
                swap(lower,upper);
                lower++;
                upper--;
            } else {
                lower++;
            }
        }
        middle = upper;
        swap(first, middle); //swap between pivot and the middle
        quickSort(first, middle-1);
        quickSort(middle+1, last);
    }

    public void swap(int i, int j){
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public void printData(){
        for (int i = 0; i<size ; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public void mergeSort(int first, int last){
        if (first < last){
            int mid = (first+last) / 2 ;
            mergeSort(first, mid);
            mergeSort(mid+1, last);
            merge(first, last);
        }
    }

    public void merge(int first, int last){
        int[] result = new int [last - first + 1];
        int mid = (first+last) /2, left = first, right = mid+1;
        int iAtResult = 0;
        while (left <= mid && right <= last){
            if (data[left] < data[right]){
                result[iAtResult++] = data[left++];
            } else {
                result[iAtResult++] = data[right++];
            }
        }
        //add the rest of either side into result
        while (left<=mid){ //data on left side has some item(s) remain
            result[iAtResult++] = data[left++];
        }

        while (right<=last){ //data on the right side has some items remain
            result[iAtResult++] = data[right++];
        }
        for ( iAtResult = 0; iAtResult < last-first+1; iAtResult++) {
            data[first+iAtResult] = result[iAtResult];
        }
    }

    public void radixSort() {
        int radix = 10, digits = 5;
        int d = 0;
        Queue<Integer> [] q = new Queue[10];
        for (d = 0; d < radix; d++) {
            q[d] = new LinkedList<>();
        }

        int factor = 1;
        for (d = 1; d <= digits; factor *= 10, d++) {
            //copy data to the queue according pass (d)
            for (int i = 0; i < size; i++) {
                //if pass = 2 => 49123 => 2 => (49123/10 => 4912 => 4912%10 = 2)
                //if pass = 3 => 49123 => 1 => (49123/100 => 491 => 491%10 = 1)
                //if pass = 4 => 49123 => 9 => (49123/1000 => 49 => 49%10 = 1)
                q[(data[i]/factor) % radix].add(data[i]);
            }
            //copy from q[] back to data
            for (int j = 0,k=0; j < radix; j++) {
                while (!q[j].isEmpty()){
                    data[k++] = q[j].remove();
                }
            }

        }

    }

}
