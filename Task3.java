import java.util.Scanner;
//Квадратное уравнение
public class Task3 {
    public static void main(String[] args) {
        double a,b,c;
        double D;
        System.out.println("Вычисляем корни квадратного уравнения ax^2+bx+c=0");
        System.out.println("Введите числовые значения a,b,c");
        Scanner in=new Scanner(System.in);
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();
        D =discriminant(a,b,c);
        if (isPozitive(D,0)) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (isZero(D,0)) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет 1 корень: x = " + x);
        }
        else {
            System.out.println("Уравнение не имеет корней");
        }
    }
    public static boolean isZero(double D,int v){
        return D==v;
    }
    public static boolean isPozitive(double d,int v){
        return d>v;
    }
    public static double discriminant(double a, double b, double c){
        double D = b*b-4*a*c;
        return D;
    }
}
