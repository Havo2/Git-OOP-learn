/*
6.	Создайте метод,
который принимает строку в качестве аргумента
и возвращает ее в обратном порядке.
 */
/*
import java.util.Scanner;

public class Task6 {
    public static void main (String[] args){
        System.out.print("Введите строку: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.print(reverseString(str));
    }
    public static String reverseString(String str) {
        char[] array = str.toCharArray();
        String reverse = "";
        for (int n = array.length - 1; n >= 0; n--) {
            reverse = reverse + array[n];
        }
        return (reverse);
    }
}
*/













/*
6.	Создайте метод,
который принимает строку в качестве аргумента
и возвращает ее в обратном порядке.
 */
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите любую строку");
        String S = scn.nextLine();
        System.out.println(Reverse(S));
    }
    public static String Reverse(String S)
    {
        String Reversed = "";
        char[] ones = S.toCharArray();
        for (int i = ones.length - 1; i >= 0; --i)
        {
            Reversed += ones[i];
        }
        return Reversed;
    }
}



















