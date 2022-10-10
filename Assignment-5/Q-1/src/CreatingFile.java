/*
    Name-Yash Gohil
    ID-21CE034
    Aim - WAP to show how to create a file with different mode and methods
    of File class to find path, directory etc.
*/
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class CreatingFile
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("sample.txt");
        FileWriter fw = new FileWriter(f);
        System.out.println("getName:\t"+f.getName());
        System.out.println("getPath:\t"+f.getPath());
        System.out.println("getFilePath:\t" + f.getAbsolutePath());
        System.out.println("getCanonical Path:\t"+f.getCanonicalPath());
        System.out.println("canExecute:\t" + f.canExecute());
        System.out.println("canRead:\t"+f.canRead());
        System.out.println("canWrite:\t"+f.canWrite());
        System.out.println("getParent:\t"+f.getParent());
        System.out.println("getUsableSpace:\t"+f.getUsableSpace());
        System.out.println("getFreeSpace:\t"+f.getFreeSpace());
        System.out.println("getTotalSpace:\t"+f.getTotalSpace());
        fw.write("Hello World....Welcome to Java Programming......");
        f.createNewFile();
        fw.close();
        FileReader fr = new FileReader(f);
        int i;
        while((i=fr.read()) != -1)
        {
            System.out.print((char)i);
        }
        fr.close();
        System.out.println("\ndelete:\t"+f.delete());
    }
}
