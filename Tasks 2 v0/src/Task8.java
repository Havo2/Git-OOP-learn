/*
8.	Создайте функцию, которая принимает строку,
проверяет, имеет ли она одинаковое количество x и o
и возвращает либо true, либо false.
Правила:
- Возвращает логическое значение (true или false).
- Верните true, если количество x и o одинаковы.
- Верните false, если они не одинаковы.
- Строка может содержать любой символ.
- Если "x" и "o" отсутствуют в строке, верните true.
*/
/*
public class Task8 {
    public static void main(String[] args){
        System.out.print(getXO("zzxx"));
    }
    public static boolean getXO(String x){
        boolean Obs = true;
        int xCounter =0;
        int oCounter = 0;
        char[] charStr = x.toCharArray();
        for (int i=0; i< charStr.length; i++){
            if(charStr[i]=='x'){
                xCounter++;
            }
            if(charStr[i]=='o'){
                oCounter++;
            }
        }
        if(xCounter==oCounter){
            Obs = true;
        }
        else{
            Obs= false;
        }
        return Obs;
    }
}
*/











/*
8.	Создайте функцию, которая принимает строку,
проверяет, имеет ли она одинаковое количество x и o
и возвращает либо true, либо false.
Правила:
- Возвращает логическое значение (true или false).
- Верните true, если количество x и o одинаковы.
- Верните false, если они не одинаковы.
- Строка может содержать любой символ.
- Если "x" и "o" отсутствуют в строке, верните true.
*/
import java.util.Scanner;
public class Task8{
    public static void main(String[] args) {
        System.out.println("Введите любую строку");
        Scanner scn = new Scanner(System.in);
        String Random = scn.nextLine();
        System.out.println(XO(Random));
    }
    public static boolean XO(String first)
    {
        int xCounter = 0;
        int oCounter = 0;
        char[] xos = first.toCharArray();
        for (int i = 0; i < xos.length; i++)
        {
            if (xos[i] == 'x')
                xCounter++;
            if (xos[i] == 'o')
                oCounter++;
        }
        boolean equalsnumber = true;
        if (xCounter != oCounter)
            equalsnumber = false;
        return equalsnumber;
    }
}


























