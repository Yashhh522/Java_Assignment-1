/*
    Name-Yash Gohil
    ID-21CE034
    Aim - WAP to show the try - catch block to catch the different types of exception.
 */

public class ExceptionExamples
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("First Try-block...");
            int a = (7/0);
            System.out.println(a);
        }
        catch(ArithmeticException e1)
        {
            System.out.println(e1);
        }
        System.out.println();
        try
        {
            System.out.println("Second Try-block...");
            String b = null;
            System.out.println(b.charAt(1));
        }
        catch(NullPointerException e2)
        {
            System.out.println(e2);
        }
        System.out.println();
        try
        {
            System.out.println("Third Try-block...");
            String c = "Good morning everyone.";
            System.out.println(c.charAt(25));
        }
        catch(StringIndexOutOfBoundsException e3)
        {
            System.out.println(e3);
        }
        System.out.println();
        try
        {
            System.out.println("Fourth Try-block...");
            int [] d = new int [6];
            d[10] = 10;
            int i = d[10];
            System.out.println(i);
        }
        catch(ArrayIndexOutOfBoundsException e4)
        {
            System.out.println(e4);
        }
        System.out.println();
        try
        {
            System.out.println("Fifth Try-block...");
            int e = Integer.parseInt("Hello");
            System.out.println(e);
        }
        catch(NumberFormatException e5)
        {
            System.out.println(e5);
        }
        System.out.println();
        try
        {
            System.out.println("Sixth Try-block...");
            Class.forName("New Class");
        }
        catch(ClassNotFoundException e6)
        {
            System.out.println(e6);
        }
    }
}
