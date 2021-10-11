/*
2.	Вы подсчитываете очки за баскетбольный матч,
учитывая количество забитых 2-х и 3-х очков,
находите окончательные очки для команды и возвращаете это значение.
 */
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите кол-во двухочковых и трёхочковых бросков ");
        int doubles = scn.nextInt();
        int triples = scn.nextInt();
        System.out.print(points(doubles,triples));
    }
    public static int points(int doubles, int triples)
    {
        return (doubles * 2 + triples * 3);
    }
}
