/*
5.	Создайте функцию, которая принимает три целочисленных аргумента
(a, b, c) и возвращает количество целых чисел,
имеющих одинаковое значение.
 */
/*
import java.util.Scanner;
public class Task5 {
    public static void main (String[] args){
        System.out.print("Введите три целочисленных аргумента: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.print(equal(a,b,c));
    }
    public static int equal(int a, int b, int c){
        int equal=0;
        if ((a==b)|(b==c)|(a==c)){
            equal=2;
        }
        if((a==b)&(a==c)&(b==c)){
            equal++;
        }
        return(equal);
    }
}
*/











/*
5.	Создайте функцию, которая принимает три целочисленных аргумента
(a, b, c) и возвращает количество целых чисел,
имеющих одинаковое значение.
 */
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args)
    {
        System.out.println("Введите три целочисленных аргумента");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        System.out.println(equals(a, b, c));
    }
    public static int equals(int a, int b, int c)
    {
        int k = 0;
        if ((a == b) || (b == c) || (a == c))
        {
            k = 2;
        }
        if ((a == b) & (b == c))
            k++;
        return k;
    }
}



















