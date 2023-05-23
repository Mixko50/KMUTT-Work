package Slide_1;

import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        Map<String, Count> words = new TreeMap<>(new StringComparator());
        String delim = " \t\n.,:;?!-/()[]\"\'";
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String line, word;
        Count count;

        StringTokenizer st = new StringTokenizer(in, delim);
        while (st.hasMoreTokens()) {
            word = st.nextToken().toLowerCase();
            count = words.get(word);
            if (count == null) {
                words.put(word, new Count(word, 1));
            } else {
                count.i++;
            }
        }


        Set<Map.Entry<String, Count>> set = words.entrySet();
        Iterator<Map.Entry<String, Count>> iter = set.iterator();

        while (iter.hasNext()) {
            Map.Entry<String, Count> entry = iter.next();
            word =  entry.getKey();
            count = entry.getValue();
            System.out.println(word +
                    (word.length() < 8 ? "\t\t" : "\t") +
                    count.i);
        }
    }
}

