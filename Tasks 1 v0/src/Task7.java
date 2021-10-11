/*
7.	Исправьте код, чтобы решить эту задачу
(только синтаксические ошибки).
Посмотрите на приведенные ниже примеры,
чтобы получить представление о том,
что должна делать эта функция.
 */
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = scn.nextInt();
        System.out.print(squared(x));
    }
    public static int squared(int a){
        return(a*a);
    }
}
