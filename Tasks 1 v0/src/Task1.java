/*
1.	Напишите функцию, которая принимает целое число минут и преобразует его в секунды.
 */
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введите кол-во минут: ");
        Scanner scn = new Scanner(System.in);
        int min = scn.nextInt();
        System.out.print("Кол-во секунд: ");
        System.out.print(convert(min));
    }
    public static int convert(int x) {
        return 60*x;
    }
}
