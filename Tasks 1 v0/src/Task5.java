/*
5.	В Java есть логический оператор &&.
Оператор && принимает два логических значения и возвращает true,
если оба значения истинны.
 */
public class Task5 {
    public static void main(String[] args){
        System.out.print(and(true,true));
    }
    public static boolean and(boolean a, boolean b){
        return (a && b);
    }
}
