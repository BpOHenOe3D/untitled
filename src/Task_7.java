import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        int x = 7;
                int y = 6;
                        int z =5;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число:");
        int t = scan.nextInt();
        if (t == x)
            System.out.println("Данное значение имеется в константах" );
        else if (t == y)
            System.out.println("Данное значение имеется в константах" );
        else if (t == z)
            System.out.println("Данное значение имеется в константах" );
        else
        {System.out.println("Такой константы нет!");}
    }
}
