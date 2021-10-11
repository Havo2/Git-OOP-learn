/*
4.	Создайте функцию,
которая принимает массив
и возвращает разницу между наибольшим и наименьшим числами.
 */
/*
public class Task4 {
    public static void main(String[] args) {
        int[] Arr = {5, 4, 34, -6, 4, 6};
        System.out.println(differenceMaxMin(Arr));
    }
    public static int differenceMaxMin(int [] Arr){
        int max = Arr[Arr.length-1];
        int min = Arr[Arr.length-1];
        for (int i=0; i< Arr.length; i++){
            if (Arr[i] > max){
                max = Arr[i];
            }
            if (Arr[i] < min) {
                min = Arr[i];
            }
        }
        return Math.abs(max-min);
    }
}
*/


















/*
4.	Создайте функцию,
которая принимает массив
и возвращает разницу между наибольшим и наименьшим числами.
 */
import java.util.Scanner;
public class Task4
{
    public static void main(String[] args)
    {
        int[] massiv = {5, 4, 5, 15, 15, -10, 2, 3, 6, 7};
        System.out.println(Difference(massiv));
    }
    public static int Difference(int[] isxodniimassiv)
    {
        int difference = 0;
        int min = isxodniimassiv[0];
        int max = isxodniimassiv[0];
        for (int i = 0; i < isxodniimassiv.length; i++)
        {
            if (isxodniimassiv[i] < min)
                min = isxodniimassiv[i];
            if (isxodniimassiv[i] > max)
                max = isxodniimassiv[i];
        }
        difference = Math.abs(max - min);
        return difference;
    }
}












