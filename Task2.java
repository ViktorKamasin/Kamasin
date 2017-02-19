import java.util.Scanner;
// Дома
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сторону а");
        int a = scan.nextInt();
        System.out.println("Введите сторону b");
        int b = scan.nextInt();
        System.out.println("Введите сторону c");
        int c = scan.nextInt();
        System.out.println("Введите сторону d");
        int d = scan.nextInt();
        System.out.println("Введите сторону e");
        int e = scan.nextInt();
        System.out.println("Введите сторону f");
        int f = scan.nextInt();
        if ((e >= (a + c)) && (f >= b && b >= d)) {
            System.out.println("Можно построить 2 дома");
        } else if ((e >= (a + d)) && (f >= b && b >= c)) {
            System.out.println("Можно построить 2 дома");
        } else if ((e >= (b + c)) && (f >= a && b >= d)) {
            System.out.println("Можно построить 2 дома");
        } else if ((e >= (b + d)) && (f >= a && b >= c)) {
            System.out.println("Можно построить 2 дома");
        } else if ((f >= (a + c)) && (e >= b && a >= d)) {
            System.out.println("Можно построить 2 дома");
        } else if ((f >= (a + d)) && (e >= b && a >= c)) {
            System.out.println("Можно построить 2 дома");
        } else if ((f >= (b + c)) && (e >= a && a >= d)) {
            System.out.println("Можно построить 2 дома");
        } else if ((f >= (b + d)) && (e >= a && a >= c)) {
            System.out.println("Можно построить 2 дома");
        }
        else
            System.out.println("Нельзя построить 2 дома");
    }
}
