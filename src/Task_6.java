import java.util.Scanner;

public class Task_6 {
    void srednee(int x, int y, int z)
    {
    int srednee= ((x+y+z)/3)/2; // вычисляем среднее арифметическое и делим его на 2
    if (srednee > 3 )
    System.out.println("Программа выполнена корректно" );
    else
    {System.out.println("Программа выполнена некорректно");}

}
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        Task_6 srednee = new Task_6();
        int x,y,z;
        System.out.println("Введите Первое число ");
        x=in.nextInt();
        System.out.println("Введите второе число ");
        y=in.nextInt();
        System.out.println("Введите третье число");
        z=in.nextInt();
        srednee.srednee(x,y,z);
    }
}
