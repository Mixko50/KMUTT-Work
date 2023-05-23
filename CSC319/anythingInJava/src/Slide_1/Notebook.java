package Slide_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Notebook {
    private ArrayList<String> notes = new ArrayList<>();

    public void storeNote(String note) {
        notes.add(note);
    }

    public void storeNoteAtIndex(int index, String note) {
        notes.add(index, note);
    }

    public void removeNoteWithElement(String note) {
        notes.remove(note);
    }

    public int numberOfNotes() {
        return notes.size();
    }

    public void showNote(int noteNumber) {
        if (noteNumber < 0 ) {
            System.out.println("Note number is invalid");
        } else if (noteNumber < numberOfNotes()) {
            System.out.println(notes.get(noteNumber));
        } else {
            System.out.println("Note number is invalid");
        }
    }

    public void listNotesWithForEach() {
        for (String note: notes) {
            System.out.println(note);
        }
    }

    public void listNotesWithWhileLoop() {
        int index = 0;
        while (index < notes.size()) {
            System.out.println(notes.get(index));
            index++;
        }
    }

    public void listNotesWithIterator() {
        Iterator<String> it = notes.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
