import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_14 {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        String s = reader.readLine();
        int x = Double.valueOf(s).intValue();
        float y =x;
        System.out.printf("%s\n%d\n%f\n",s,x,y);
    }}
