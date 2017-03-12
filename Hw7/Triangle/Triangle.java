package Hw7.Triangle;
import Hw7.Figure;

public class Triangle extends Figure implements Height, HalfPerimeter  {

    protected double sideAB;
    protected double sideBC;
    protected double sideCA;

    @Override
    public double halfPerimeter() {
        return (sideAB + sideBC + sideCA) / 2;
    }

    @Override
    public double areaCalc() {
        return Math.sqrt(halfPerimeter() * (halfPerimeter() - sideAB) * (halfPerimeter() - sideBC) * (halfPerimeter() - sideCA));
    }

    @Override
    public double heightFromPointA() {
        return areaCalc() * 2 / sideBC;
    }

    @Override
    public double heightFromPointB() {
        return areaCalc() * 2 / sideCA;
    }

    @Override
    public double heightFromPointC() {
        return areaCalc() * 2 / sideAB;
    }

    @Override
    public String toString() {
        return String.format("У треугольника со сторонами %.1f, %.1f, %.1f  площадь -  %.1f  высоты - %.1f, %.1f, %.1f",
                sideAB, sideBC, sideCA, areaCalc(), heightFromPointA(), heightFromPointB(), heightFromPointC());
    }

    public Triangle(double sideAB, double sideB, double sideC) {
        this.sideAB = sideAB;
        this.sideBC = sideB;
        this.sideCA = sideC;
    }
}
