import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Point3d Point1 = new Point3d();
        Point3d Point2 = new Point3d();
        Point3d Point3 = new Point3d();

        System.out.println("Введите координаты первой точки: ");
        Scanner scan = new Scanner((System.in));

        Point1.setX(scan.nextDouble());
        Point1.setY(scan.nextDouble());
        Point1.setZ(scan.nextDouble());

        System.out.println("Введите координаты второй точки: ");

        Point2.setX(scan.nextDouble());
        Point2.setY(scan.nextDouble());
        Point2.setZ(scan.nextDouble());

        System.out.println("Введите координаты третьей точки: ");

        Point3.setX(scan.nextDouble());
        Point3.setY(scan.nextDouble());
        Point3.setZ(scan.nextDouble());

        //Рассчет расстояния между двумя точками
        System.out.print("Расстояние между точками: ");
        System.out.printf("%.2f", Point1.DistanceTo(Point2));
        System.out.println("");

        //Проверка равенства координат двух точек
        System.out.print("Равенство двух точек с координатами " + "(" + Point1.getX() + " " + Point1.getY() + " " + Point1.getZ()
                + ")" + " и " + "(" + Point3.getX() + " " + Point3.getY() + " " + Point3.getZ() + ")" + ": ");
        System.out.println(Point1.Compare(Point3));

        // Проверка на равенство координат трех точек и вывод площади треугольника если введенные координаты точек не равны
        if ((Point1.Compare(Point2)) | (Point1.Compare(Point3))){
            System.out.print("Введены одинаковые координаты, невозможно посчитать площадь");
        }
        else{

            System.out.print("Площадь треугольника: " + computeArea(Point1, Point2, Point3));
        }
    }
    public static double computeArea(Point3d Point1, Point3d Point2, Point3d Point3){
        double a = Point1.DistanceTo(Point2);
        double b = Point1.DistanceTo(Point3);
        double c = Point2.DistanceTo(Point3);
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
