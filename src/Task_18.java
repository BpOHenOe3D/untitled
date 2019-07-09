import java.io.*;


public class Task_18 {
    public static int count = 0;
    public static void readFile()
    {
        try
        {
            FileInputStream fstream = new FileInputStream("D:\\test.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null)
            {
                System.out.println(strLine);
                {++count;}
            }
        }catch (IOException e){
            System.out.println("Ошибка"+e);
        }
    }
    public static void writeFile()   {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст");
        try (FileWriter fw = new FileWriter("D:\\test.txt")){
            while (count!=0){
                System.out.println("");
                str = br.readLine();
                str = str +"\r\n";
                fw.write(str);
                count--;
            }
        }
        catch (IOException e) {
            System.out.println("Ошибка ввода"+e);
        }
    }

    public static void main(String[] args) {
        Task_18.readFile();
        Task_18.writeFile();
    }
}