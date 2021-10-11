/*
3.	Создайте функцию,
которая принимает два аргумента:
исходную цену и процент скидки в виде целых чисел
и возвращает конечную цену после скидки.
 */
/*
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите исходную цену и процент скидки: ");
        Scanner scan = new Scanner(System.in);
        float price = scan.nextInt();
        float discount = scan.nextInt();
        System.out.print(discount(price,discount));
    }
    public static float discount (float price, float discount){
        return price-(price*discount/100);
    }
}
*/









































/*
3.	Создайте функцию,
которая принимает два аргумента:
исходную цену и процент скидки в виде целых чисел
и возвращает конечную цену после скидки.
 */
import java.util.Scanner;
public class Task3{
    public static void main(String[] args)
    {
        System.out.println("Введите исходную цену и процент скидки в виде целых чисел");
        Scanner scn = new Scanner(System.in);
        float price = scn.nextInt();
        float discount = scn.nextInt();
        System.out.println(Finalprice(price, discount));
    }
    public static float Finalprice(float price, float discount)
    {
        float finalprice = price * (1 - (discount / 100));
        return finalprice;
    }
}