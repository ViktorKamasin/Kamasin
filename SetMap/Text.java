package SetMap;

import java.util.*;

public class Text {
    public static String text = "Happy new year Happy new year may we all have a vision now and then of a world where" +
            "every neighbour is a friend";

    public static void main(String[] args) {
        List<String> words = Arrays.asList(Text.text.split(" "));
        System.out.println("Частота встречаемости слов: ");

        for (String w : new HashSet<>(words)) {
            System.out.println(w + " - " + Collections.frequency(words, w));
        }
    }
}