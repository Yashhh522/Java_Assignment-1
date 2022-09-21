/*
    Name-Yash Gohil
    ID-21CE034
    Aim - WAP to generate user defined exception using “throw” and “throws” keyword.
 */

class customException extends Exception
{
    public customException(String s)
    {
        super(s);
    }
}
public class UserdefinedException
{
    static int test(int x, int y)
    {
        throw new ArithmeticException();
    }
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Inside first try-block...");
            throw new customException("This is a Custom-Exception.");
        }
        catch(customException e1)
        {
            System.out.println(e1);
        }
        System.out.println();
        try
        {
            System.out.println("Inside second try-block...");
            System.out.println("Use of throw and throws keyword.");
            int z = test(10,0);
        }
        catch(ArithmeticException e2)
        {
            System.out.println(e2);
        }
    }
}
