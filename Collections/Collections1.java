package Collections;

import java.util.List;
import java.util.ArrayList;

public class Collections1 {
    public static void main(String[] args) {
        List<String> string = new ArrayList<>();
        string.add("a");
        string.add("as");
        string.add("asd");
        string.add("asdf");
        string.add("asdfg");
        string.add("zxcv");
        string.add("asdfghj");
        markLength4(string);
        for (String a : string) {
            System.out.println(a);
        }
    }

    private static void markLength4(List<String> string) {
        for (int i = 0; i < string.size(); i++) {
            if (string.get(i).length() == 4) {
                string.add(i, "****");
                i++;
            }
        }
    }
}
