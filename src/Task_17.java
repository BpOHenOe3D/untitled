import java.io.*;

public class Task_17
{
    public static void main(String[] args)
    {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст, для окончания ввода, напишите stop");
        try (FileWriter fw = new FileWriter("D:\\test.txt")){
            do {
                System.out.println("");
                str = br.readLine();
                if (str.compareTo("stop")==0) break;
                str = str +"\r\n";
                fw.write(str);
            }while (str.compareTo("stop")!=0);
        } catch (IOException e) {
            System.out.println("Ошибка ввода"+e);
        }
    }
}
