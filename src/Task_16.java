import java.io.*;

public class Task_16{
    public static void main(String[] args){
        try{
            FileInputStream fstream = new FileInputStream("D:\\test.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null){
                System.out.println(strLine);
            }
        }catch (IOException e){
            System.out.println("Ошибка"+e);
        }
    }
}