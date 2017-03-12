package Hw7;

/**
 * Created by madwo on 12.03.2017.
 */
public class Circle extends Figure{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double areaCalc() {
        return (Math.pow(radius,2)* Math.PI);
    }

    @Override
    public String toString() {
        return ("У круга радиусом  "+radius+ " площадь -  "+areaCalc());
    }
}