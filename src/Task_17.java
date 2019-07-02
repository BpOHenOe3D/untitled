import java.io.*;

public class Task_17
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream = new FileOutputStream("D:\\test.txt");
        System.out.println("Введите текст, для окончания ввода, напишите exit");

        while (true)
        {
            String data = reader.readLine();
            if(data.equals("exit")){
                outputStream.write(data.getBytes());
                break;
            }
            else {
                outputStream.write((data +"\r\n").getBytes());
            }
        }
        outputStream.close();
        reader.close();
    }

}