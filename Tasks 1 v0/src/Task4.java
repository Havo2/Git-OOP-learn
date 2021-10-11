/*
4.	Создайте функцию, которая возвращает true,
если целое число равномерно делится на 5,
и false в противном случае.
 */
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число для проверки его на целое деление на 5: ");
        int a = scn.nextInt();
        System.out.print(divisibleByFive(a));
    }
    public static boolean divisibleByFive(int a){
        return (a%5 == 0);
    }
}
