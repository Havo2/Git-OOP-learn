import java.lang.Math;
import java.text.DecimalFormat;
//двумерный класс точки
public class Point2d {
    //координата X
    private double xCoord;
    //координата Y
    private double yCoord;
    //Коснтруктор инициализации
    public Point2d ( double x, double y) {
        xCoord = x;
        yCoord = y;
    }
    //Коснтруктор по умолчанию.
    public Point2d () {
        this(0, 0);
    }
    //Возвращение координаты X
    public double getX () {
        return xCoord;
    }
    //Возвращение координаты Y
    public double getY () {
        return yCoord;
    }
    //Установка значения координаты X.
    public void setX ( double val) {
        xCoord = val;
    }
    //Установка значения координаты Y.
    public void setY ( double val) {
        yCoord = val;
    }
}