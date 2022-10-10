/*
    Name-Yash Gohil
    ID-21CE034
    Aim - WAP to show use of character and byte stream.
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Byte_Charac_Stream
{
    public static void main(String[] args)
    {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try
        {
            fis = new FileInputStream("InputFile.jpg");
            fos = new FileOutputStream("OutputFile.jpg");
            int temp;
            while ((temp = fis.read()) != -1)
            {
                fos.write(temp);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (fis != null)
            {
                try
                {
                    fis.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            if (fos != null)
            {
                try
                {
                    fos.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
