/*
    Name-Yash Gohil
    ID-21CE034
    Aim - Write a program to transfer data from one file to another file
    so that if the destination file does not exist, it is created.
 */
import java.io.*;
import java.util.*;
public class FileCopying
{
    public static void copyContent(File a, File b) throws Exception
    {
        FileInputStream in = new FileInputStream(a);
        FileOutputStream out = new FileOutputStream(b);
        try
        {
            int n;
            while ((n = in.read()) != -1)
            {
                out.write(n);
            }
        }
        finally
        {
            if (in != null)
            {
                in.close();
            }
            if (out != null)
            {
                out.close();
            }
        }
        System.out.println("File Copied");
    }
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the source filename from where you want to read/copy : ");
        String a = sc.nextLine();
        File x = new File(a);
        System.out.print("Enter the destination filename where you want to write/paste : ");
        String b = sc.nextLine();
        File y = new File(b);
        copyContent(x, y);
    }
}
