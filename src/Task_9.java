import java.util.Scanner;


public class Task_9 {
    public static void main(String[] agrs)
    {
        int[] a = new int[2];
        int i = 0;
        int k =2;
        Scanner in = new Scanner(System.in);
        for (int element : a)
        {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            a[i] = in.nextInt();
            System.out.println(a[i] + "");
            i++;
        }
        for (int element : a)

            System.out.print(element*k + " ");

    }
}
