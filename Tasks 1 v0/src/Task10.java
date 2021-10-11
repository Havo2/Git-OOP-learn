/*
10.	Создайте функцию, которая будет работать как оператор модуля %
без использования оператора модуля.
Оператор модуля-это способ определения остатка операции деления.
Вместо того чтобы возвращать результат деления,
операция по модулю возвращает остаток целого числа.
 */
import java.util.Scanner;

public class Task10 {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите число и делитель: ");
        int x = scn.nextInt();
        int y = scn.nextInt();
        System.out.println(mod(x,y));
    }
    public static int mod (int a, int b){
        while (a >= b){
            a -= b;
        }
        return (a);
    }
}
