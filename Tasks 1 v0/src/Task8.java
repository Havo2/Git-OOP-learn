/*
8.	Создайте функцию,
которая принимает три аргумента prob, prize, pay и возвращает true,
если prob * prize > pay; в противном случае возвращает false.
 */
import java.util.Scanner;

public class Task8 {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите три числа: ");
        float prob = scn.nextFloat();
        int prize = scn.nextInt();
        int pay = scn.nextInt();
        System.out.println(profitableGamble(prob, prize, pay));
    }
    public static boolean profitableGamble(float a, int b, int c){
        return (a*b>c);
    }
}
