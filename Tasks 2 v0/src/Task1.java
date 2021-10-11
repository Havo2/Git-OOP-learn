/*
1.	Теша шел по прямой улице,
по обеим сторонам которой стояло ровно n одинаковых домов.
Номера домов на улице выглядят так:

1 |   | 6           1 |   | 10

3 |   | 4           3 |   | 8

5 |   | 2           5 |   | 6

                    7 |   | 4

                    9 |   | 2

Она заметила, что четные дома увеличиваются справа,
а нечетные уменьшаются слева.

Создайте функцию, которая принимает номер дома и длину улицы n
и возвращает номер дома на противоположной стороне.

 */
import java.util.Scanner;

public class Task1 {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите номер дома и длину улицы");
        int num = scn.nextInt();
        int l = scn.nextInt();
        System.out.print(oppositeHouse(num,l));
    }
    private static int oppositeHouse(int num, int l) {
        int temp;
        int res=0;
        if (num%2==0){
            temp = (2*l - num)/2 + 1;
            res = (2*l-1)-(l - temp)*2;
        }
        else{
            temp = (1 + num)/2;
            res = (l - temp)*2+2;
        }
        return (res);
    }
}
