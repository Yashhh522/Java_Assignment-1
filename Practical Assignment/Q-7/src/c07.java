import java.io.*;
public class c07
{
    File readInFile = new File("text.txt");
    int readFileme(String line, File file)
    {
        if (readInFile.exists())
        {
            return line.length();
        }
        else
        {
            return -1;
        }
    }
    public static void main(String[] args) throws IOException
    {
        String str = "File Handling in Java using FileWriter and FileReader";
        FileWriter writeInFile = new FileWriter("text.txt");
        for (int i = 0; i < str.length(); i++)
            writeInFile.write(str.charAt(i));
        System.out.println("Writing successful");
        writeInFile.close();
        int ch;
        FileReader readInFile = new FileReader("text.txt");
        System.out.println("File created Successfully");
        System.out.println("File is found");
        while ((ch = readInFile.read()) != -1)
            System.out.print((char) ch);
        readInFile.close();
        System.out.println();
        System.out.println("\nPrepared by : 21CE034_Yash Gohil");
    }
}
