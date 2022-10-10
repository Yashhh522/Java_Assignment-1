/*
    Name-Yash Gohil
    ID-21CE034
    Aim - When to use Character Stream over Byte Stream? When to use Byte Stream
    over Character Stream? Give example.
*/
import java.io.*;
public class Byte_Charac_StreamUse
{
    public static void main(String[] args) throws IOException
    {
        FileReader CharIn = new FileReader("txt1.txt");
        FileInputStream ByteIn = new FileInputStream("txt2.txt");
        int x,y;
        System.out.println("From Character Stream...");
        while ((x = CharIn.read()) != -1)
        {
            System.out.print((char)x);
        }
        System.out.println("\n\n\nFrom Byte Stream....");
        while ((y = ByteIn.read()) != -1) {
            System.out.print((char)y);
        }
    }
}
