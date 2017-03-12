package Hw7;

/**
 * Created by madwo on 12.03.2017.
 */
public abstract class Figure implements Area {

    public abstract String toString ();

    public boolean isAreaEqual(Figure firstFigure){
        return firstFigure.areaCalc()== this.areaCalc();
    }
}
