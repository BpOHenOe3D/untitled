import java.util.Scanner;

public class Task_4 {
    public static void  main (String[] args ){
        Scanner sn = new Scanner(System.in);
        System.out.println("Введите число в бинарной системе счисления:");
        String bin = sn.nextLine();
        int binNum = Integer.parseInt(bin, 2);
        System.out.println(binNum);
    }
}

