import java.util.Scanner;

public class Task_14 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        String s = scan.nextLine();
        int x = Integer.parseInt(s);
        float y =x;
        System.out.printf("%s\n%d\n%f\n",s,x,y);
    }}
