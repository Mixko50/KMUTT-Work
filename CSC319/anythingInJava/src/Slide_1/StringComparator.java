package Slide_1;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        if (s1 != null && s2 != null) {
            return - (s1.compareTo(s2));
        } else {
            return 0;
        }
    }
}
