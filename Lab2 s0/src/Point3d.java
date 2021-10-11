import java.lang.Math;
import java.text.DecimalFormat;
//трехмерный класс точки
public class Point3d extends Point2d{
    //координата Z
    private double zCoord;
    //Конструктор инициализации
    public Point3d (double x, double y, double z)
    {
        zCoord = z;
    }
    //Конструктор по умолчанию.
    public Point3d () {
        this(0,0,0);
    }
    //Возвращение координаты Z
    public double getZ () {
        return zCoord;
    }
    //Установка значения координаты Z.
    public void setZ ( double val) {
        zCoord = val;
    }
    public boolean Compare (Point3d Coords)
    {
        return (Coords.getX()==this.getX() & Coords.getY()==this.getY() & Coords.getZ()==this.getZ());
    }
    public double DistanceTo (Point3d Coords)
    {
        return Math.sqrt(Math.pow(this.getX()-Coords.getX(),2) + Math.pow(this.getY()-Coords.getY(),2)+ Math.pow(this.getZ()-Coords.getZ(),2));
    }

}
