package Hw7;

import Hw7.Quadrangle.Quadrangle;
import Hw7.Quadrangle.Rectangle;
import Hw7.Triangle.Triangle;


public class ShapeUtil {
    public static boolean isQuadrangle(Figure figure) {
        return figure instanceof Quadrangle;
    }


    public static boolean isTriangle(Figure figure) {
        return (figure instanceof Triangle);
    }
}
