/*
3.	Создайте функцию, которая принимает количество побед,
ничьих и поражений и вычисляет количество очков,
набранных футбольной командой на данный момент.
 */
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите кол-во побед, проигрышей и ничьих: ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        System.out.print(footballPoints(a,b,c));

    }
    public static int footballPoints(int a, int b, int c){
        return (3*a + b + 0*c);
    }
}
