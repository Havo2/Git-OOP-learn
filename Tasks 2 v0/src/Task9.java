/*import java.util.Locale;
public class Task9 {
    public static void main(String[] args){
        System.out.print(bomb("Hey, did you think there is a BOMB?"));
    }
    public static String bomb(String str){
        String note ="Relax, there is no bomb";
        String[] strArr = str.split("[\\W]");
        for (int i =0; i< strArr.length; i++){
            String upperWord = strArr[i].toUpperCase(Locale.ROOT);
            if (upperWord.equals("BOMB")){
                note = "DUCK!";
            }
        }
        return note;
    }
}
*/

































/*
9.	Напишите функцию, которая находит слово "бомба" в данной строке.
Ответьте "ПРИГНИСЬ!", если найдешь,
в противном случае:"Расслабься, бомбы нет".
 */
import java.util.Locale;
import java.util.Scanner;
public class Task9{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите строку");
        String S = scn.nextLine();
        System.out.println(Bombfinder(S));
    }
    public static String Bombfinder(String S)
    {
        String anybombs = "Расслабься, бомбы нет";
        String[] finder = S.split("[\\W]");
        for (int i = 0; i <finder.length; i++)
        {
            if (finder[i].toLowerCase(Locale.ROOT).equals("бомба"))
                anybombs = "ПРИГНИСЬ!";
        }
        return anybombs;
    }
}