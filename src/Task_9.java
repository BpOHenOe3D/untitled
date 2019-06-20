import java.util.Scanner;


public class Task_9 {
    public static void main(String[] agrs)
    {
        int[] a = new int[2];
        int k =2;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Введите цифру  [" + i + "]:");
            a[i] = in.nextInt();
        }
        for (int element : a)

            System.out.print(element*k + " ");

    }
}
