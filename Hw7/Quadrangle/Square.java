package Hw7.Quadrangle;

/**
 * Created by madwo on 12.03.2017.
 */
public class Square extends Quadrangle {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double firstDiagonalCalc() {
        return Math.sqrt(2*(Math.pow(side,2)));
    }

    @Override
    public double secondDiagonalCalc() {
        return super.secondDiagonalCalc();
    }

    @Override
    public double areaCalc() {
        return Math.pow(side,2);
    }

    @Override
    public String toString() {
        return "у квадрата со стороной "+side+"  площадь равняется "+areaCalc()+" а диагональ "+firstDiagonalCalc();
    }

}