
import java.util.Scanner;
public class Task6 {
    //Задача по осадкам
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите количество дней");
        int dayNumb=scan.nextInt();
        int sum=0;
        int max=0;
        for(int i=1;i<=dayNumb;i++){
            System.out.println("Введите количествово осадков в " + i + " день");
            int osadki=scan.nextInt();

            if(max<osadki){
                max=osadki;
            }
            sum+=osadki;
        }
        double middle=(double)sum/(double)dayNumb;
        System.out.println("Колличество дней-" + dayNumb);
        System.out.println("Сумма осадков- " + sum);
        System.out.println("Среднее количество- " + middle);
        System.out.println("Максимальное количество- " + max);
    }
}