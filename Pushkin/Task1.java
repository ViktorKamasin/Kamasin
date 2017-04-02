package Pushkin;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Created by madwo on 02.04.2017.
 */
public class Task1 {
    public static void main(String[] args) throws IOException {
        File directory = new File("src" + File.separator + "Pushkin");
        File result = new File(directory, "result.txt");
        File file = new File(directory, "poem.txt");
        Map<Character, Integer> map = new HashMap<>();
        result.createNewFile();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(file)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            StringBuffer stringBuffer = new StringBuffer(scanner.nextLine().toLowerCase());
            for (int i = 0; i < stringBuffer.length(); i++) {
                if (map.containsKey(stringBuffer.charAt(i))) {
                    map.replace(stringBuffer.charAt(i), map.get(stringBuffer.charAt(i)) + 1);
                } else {
                    map.put(stringBuffer.charAt(i), 1);
                }
            }

        }
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(result));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(Map.Entry<Character, Integer>entry:map.entrySet()){
            try {
                bufferedWriter.write(entry.getKey()+"-" + entry.getValue()+"\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}