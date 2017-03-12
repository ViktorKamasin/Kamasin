package Hw7;

import Hw7.Quadrangle.Rectangle;
import Hw7.Quadrangle.Rhombus;
import Hw7.Quadrangle.Square;
import Hw7.Triangle.Triangle;

public class Main {
    public static void main(String[] args) {


        Square square = new Square(4);
        System.out.println(square.toString());
        Circle circle = new Circle(6);
        System.out.println(circle.toString());
        Rectangle rectangle = new Rectangle(8, 9);
        System.out.println(rectangle.toString());
        Triangle triangle = new Triangle(6, 5, 4);
        System.out.println(triangle.toString());
        Rhombus rhombus = new Rhombus(5, 45);
        System.out.println(rhombus.toString());
        System.out.println(ShapeUtil.isQuadrangle(rhombus));
        System.out.println(ShapeUtil.isTriangle(triangle));
        System.out.println(triangle.isAreaEqual(rectangle));
    }
}
