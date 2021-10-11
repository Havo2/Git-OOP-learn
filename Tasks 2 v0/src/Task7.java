/*
7.	Вы наняли трех программистов и (надеюсь) платите им.
Создайте функцию, которая принимает три числа
(почасовая заработная плата каждого программиста)
и возвращает разницу между самым высокооплачиваемым программистом
и самым низкооплачиваемым.
*/
/*
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        System.out.print("Введите три числа: ");
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int second = scan.nextInt();
        int third = scan.nextInt();
        System.out.print(programmers(first, second, third));
    }
    public static int programmers(int first, int second, int third){
        int max =first;
        int min = first;
        if (max<second){
            max = second;
        }
        if (max<third){
            max = third;
        }
        if (min>second){
            min = second;
        }
        if (min>third){
            min = third;
        }
        return max - min;
    }
}
*/






/*
7.	Вы наняли трех программистов и (надеюсь) платите им.
Создайте функцию, которая принимает три числа
(почасовая заработная плата каждого программиста)
и возвращает разницу между самым высокооплачиваемым программистом
и самым низкооплачиваемым.
*/
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите три числа (почасовые зарплаты каждого программиста");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        System.out.println(Difference(a, b, c));
    }
    public static int Difference(int a, int b, int c)
    {
        int max = a;
        int min = a;
        if (b > a)
            max = b;
        if (c > b)
            max = c;
        if (b < a)
            min = b;
        if (c < b)
            min = c;
        return max - min;
    }
}





































