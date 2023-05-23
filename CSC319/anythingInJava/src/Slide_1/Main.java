package Slide_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Notebook noteBook = new Notebook();

        noteBook.storeNote("Mixko 1");
        noteBook.storeNote("Mixko 2");
        noteBook.storeNote("Mixko 3");
        noteBook.storeNote("Mixko 4");
        noteBook.storeNote("Mixko 5");

        noteBook.storeNoteAtIndex(1, "Mixko 234");

        System.out.println("---- While Loop ----");
        noteBook.listNotesWithWhileLoop();

        noteBook.removeNoteWithElement("Mixko 2");

        System.out.println("---- For Each Loop ----");
        noteBook.listNotesWithForEach();
        System.out.println("---- Iterator Loop ----");
        noteBook.listNotesWithIterator();


        Map<String, String> testMap = new HashMap<>();

        testMap.put("Test", "1");
        testMap.put("Test2", "2");
        testMap.put("Test3", "3");

        Iterator<String> itKey = testMap.keySet().iterator();
        Iterator<String> itValue = testMap.values().iterator();

        System.out.println("---- Iterator Map Key ----");
        while (itKey.hasNext()) {
            System.out.println(itKey.next());
        }

        System.out.println("---- Iterator Map value ----");
        while (itValue.hasNext()) {
            System.out.println(itValue.next());
        }

        System.out.println("---- Iterator map values ----");
        System.out.println(testMap.values());

        Set<String> set = new HashSet<>();
        set.add("df");
        set.add("df");
        set.add("2");
        set.add("b");
        set.add("c");

        System.out.println("---- Loop set values ----");
        System.out.println(set.size());

        for (String key : set) {
            System.out.println(key);
        }
    }
}

