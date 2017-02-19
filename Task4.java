import java.util.Scanner;
// Сумма цифр введенного чилса
public class Task4 {
    public static void main(String[] args) {
        int a,c=0;
        System.out.println("Вычисляем сумму цифр введенного Вами числа");
        System.out.println("Введите число:");
        Scanner scn=new Scanner(System.in);
        if(scn.hasNextInt()){
            a=scn.nextInt();
            while(a!=0){
                c=c+a%10;
                a/=10;
            }
            System.out.println("Сумма чисел введенного Вами числа равна "+c);
        }
        else System.out.println("Вы ввели не число");
    }
}

