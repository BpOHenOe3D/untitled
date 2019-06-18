import java.util.Scanner;

public class Task_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число:");
        TablicaUmnojenia(scan.nextInt());
    }

    public  static void TablicaUmnojenia(int a) {
        for (int b = 1; b <= 10; b++) {
            int result = a * b;
            System.out.println(a + " * " + b + " = " + result);
        }
    }
}