/*
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите имя и фамилию");
        String str = scn.nextLine();
        System.out.print(nameShuffle(str));
    }
    public static String nameShuffle(String x){
        String[] namesplit = x.split(" ");
        String shuffledName = namesplit[1] + " " + namesplit[0];
        return (shuffledName);
    }
}
 */



































/*
2.	Создайте метод, который принимает строку
(имя и фамилию человека)
и возвращает строку с заменой имени и фамилии.
 */
import java.util.Scanner;
public class Task2{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите имя и фамилию:");
        String Names = scn.nextLine();
        System.out.println(Nameshuffle(Names));
    }
    public static String Nameshuffle(String Name)
    {
        String[] namesplit = Name.split(" ");
        return namesplit[1] + " " + namesplit[0];
    }
}