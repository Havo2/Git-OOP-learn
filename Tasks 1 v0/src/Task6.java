/*
6.	У меня есть ведро с большим количеством темно-синей краски,
и я хотел бы покрасить как можно больше стен.
Создайте функцию, которая возвращает количество полных стен,
которые я могу покрасить, прежде чем мне нужно будет отправиться в магазины,
чтобы купить еще.
 */
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите кол-во квадратных метров, ширину и высоту: ");
        int n = 0;
        int w = 0;
        int h = 0;
        try {
            n = scn.nextInt();
            w = scn.nextInt();
            h = scn.nextInt();
        } catch (Exception e) {
            System.out.println("Введено вещественное число");
            return;
        }
        if (n < 0 || w < 0 || h < 0) {
            System.out.print("Введено отрицательное число");
            return;
        }
        System.out.println(howManyWalls(n,w,h));
    }
    public static int howManyWalls(int a, int b, int c){
        return (a/(b*c));
    }
}
