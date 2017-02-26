package OOP;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(2, 6);
        Point point2 = new Point(3, 4);
        Rectangle rectangle = new Rectangle(point1, point2);
        System.out.println("Площадь прямоугольник - "+rectangle.area());
        System.out.println("Длинна диагонали - "+rectangle.diagonalCloth());

    }
}
