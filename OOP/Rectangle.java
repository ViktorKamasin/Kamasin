package OOP;

/**
 * Created by madwo on 26.02.2017.
 */
public class Rectangle {
    private Point leftUpAngle;
    private Point rightDownAngle;

    public Rectangle(Point leftUpBorden, Point rightDownBorden) {
        this.leftUpAngle = leftUpBorden;
        this.rightDownAngle = rightDownBorden;
    }

    public double area() {
        this.leftUpAngle = leftUpAngle;
        this.rightDownAngle = rightDownAngle;
        return (this.leftUpAngle.getX() + this.rightDownAngle.getX()) * (this.leftUpAngle.getY() + this.rightDownAngle.getY());
    }

    public double diagonalCloth() {
        this.leftUpAngle = leftUpAngle;
        this.rightDownAngle = rightDownAngle;
        return Math.sqrt(Math.pow(this.leftUpAngle.getX() + this.rightDownAngle.getX(), 2) + Math.pow(this.leftUpAngle.getY() + this.rightDownAngle.getY(), 2));
    }
}


