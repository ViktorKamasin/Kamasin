package Pushkin.Task2;

import java.io.*;
import java.util.*;

/**
 * Created by madwo on 02.04.2017.
 */
@SuppressWarnings("ALL")
public class numbers {
    public static void main(String[] args) throws IOException {
        File directory = new File("src" + File.separator + "Pushkin" + File.separator + "Task2");
        File random = new File(directory, "random.txt");
        random.createNewFile();
        File result = new File(directory, "result.txt");
        result.createNewFile();
        FileWriter fileWriter = new FileWriter(random);
        Random randomNumb = new Random();
        for (int i = 0; i < 30; i++) {
            fileWriter.write(randomNumb.nextInt(30) + "\n");
        }
        fileWriter.flush();
        fileWriter.close();
        Scanner scanner = new Scanner(new FileInputStream(random));
        List<Integer> numbers = new ArrayList<>();
        while (scanner.hasNextLine()) {
            numbers.add(scanner.nextInt());
        }
        Collections.sort(numbers);
        Writer writer = new PrintWriter(result);
        for (int i : numbers) {
            writer.write(i + "/n");
        }
        writer.flush();
        writer.close();

    }
}
