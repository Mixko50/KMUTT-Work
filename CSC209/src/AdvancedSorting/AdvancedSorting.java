package AdvancedSorting;

public class AdvancedSorting {
    public static void main(String[] args) {
        MyData d1 = new MyData(100);
        d1.add(10); d1.add(65); d1.add(54); d1.add(88);
        d1.add(102); d1.add(56); d1.add(112); d1.add(3669);
        d1.add(1112); d1.add(9273); d1.add(191); d1.add(911);
        d1.add(0); d1.add(101); d1.add(68); d1.add(49);

        MyData d2 = new MyData(100);
        d2.data = d1.data.clone();
        d2.size = d1.size;

        MyData d3 = new MyData(100);
        d3.data = d1.data.clone();
        d3.size = d1.size;

        System.out.println("Quick sort");
        d1.printData();
        d1.quickSort(0, d1.size-1);
        d1.printData();
        System.out.println("----------------------------------------------------------");
        System.out.println("Merge sort");
        d2.printData();
        d2.mergeSort(0,d2.size-1);
        d2.printData();

        System.out.println("----------------------------------------------------------");
        System.out.println("Radix sort");
        d3.printData();
        d3.radixSort();
        d3.printData();


    }
}
