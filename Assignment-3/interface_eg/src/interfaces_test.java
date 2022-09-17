/*
    ID-21CE034
    Name-Yash Gohil
    Aim - Write a program to create a default method in an interface IPrinter. Create
    an interface IPrinter and IScanner. You can assume variables and methods for both
    interfaces. Create a concrete class to implement both the interfaces. Create 5
    objects of the class, store it in Vector and display the result of the vector.
 */
import java.util.Scanner;
import java.util.Vector;
interface IPrinter
{
    boolean printable = false;
    void print();
}
interface IScanner
{
    void scan(int num, String str);
    boolean scanned = false;
}
class Test implements IPrinter,IScanner
{
    int n=0;
    String str;
    public void print()
    {
        System.out.println("Num: " + n);
        System.out.println("Str: " + str);
    }
    public void scan(int num,String Str)
    {
        this.str = Str;
        n = num;
    }
}
public class interfaces_test
{
    public static void main(String[] args)
    {
        Test obj1 = new Test();
        Test obj2 = new Test();
        Test obj3 = new Test();
        Test obj4 = new Test();
        Test obj5 = new Test();
        Vector<Test> v = new Vector<Test>(5);
        v.add(obj1);
        v.add(obj2);
        v.add(obj3);
        v.add(obj4);
        v.add(obj5);
        System.out.println(v);
        Scanner sc = new Scanner(System.in);
        int num;
        String str;
        for (Test obj:v)
        {
            System.out.print("Enter Num: ");
            num = sc.nextInt();
            System.out.print("Enter String: ");
            str = sc.next();
            obj.scan(num,str);
        }
        for (Test obj: v)
        {
            obj.print();
        }
        System.out.println(v);
    }
}
