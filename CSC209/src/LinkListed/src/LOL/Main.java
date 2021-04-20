package LOL;

public class Main {
    public static void main(String[] args) {
        circularSinglyLinkedList list1 = new circularSinglyLinkedList();
        list1.addTotail(10);
        list1.addTotail(20);
        list1.addTotail(30);
        list1.addTotail(40);
        list1.addTotail(50);
        list1.addTotail(60);
        System.out.println(list1.tail.value);
        System.out.println(list1.head.next.next.next.next.next.next.next.value);
        System.out.println("----------------------");

        circularDoublyLinkedList list2 = new circularDoublyLinkedList();
        list2.addToTail(10);
        list2.addToTail(30);
        list2.addToTail(80);
        System.out.println(list2.head.value);
        System.out.println(list2.tail.value);
        System.out.println(list2.head.next.value);
        System.out.println(list2.tail.next.value);
        System.out.println(list2.head.prev.value);
        System.out.println(list2.tail.prev.value);


    }
}
