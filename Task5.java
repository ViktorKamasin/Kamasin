import java.util.*;
// Фибоначчи
public class Task5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите число для отображения всех чисел Фибоначчи меньше введенного Вами числа");
        int numb=in.nextInt();
        int a=0;
        int b=1;
        for(int i=0;i<numb-1;i++){
            int answer=a+b;
            System.out.println(answer);
            b=a;
            a=answer;

        }
    }

}