package String;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        StringBuilder stringBuilder = new StringBuilder(string);
        System.out.println(string.equalsIgnoreCase(stringBuilder.reverse().toString()));
    }
}

