/*
9.	Создайте метод, который возвращает количество кадров,
показанных за заданное количество минут для определенного FPS.
 */
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите колличество кадров и минут: ");
        int x = scn.nextInt();
        int y = scn.nextInt();
        System.out.print(frames(x,y));
    }
    public static int frames(int a , int b ){
        return (a*b*60);
    }
}
