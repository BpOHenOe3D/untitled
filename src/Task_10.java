import java.util.Scanner;

public class Task_10{
    public static void main (String[] args) {
        int a =2;
        int b=2;
        int k = 3;
        int[][] arr = new int[a][b];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                arr[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < 1; i++) {
            System.out.println();
            for (int j = 0; j< b; j++) {
                System.out.print( arr[i][j]*k + " ");
            }
        }
        System.out.print("\n") ;
    }
}
