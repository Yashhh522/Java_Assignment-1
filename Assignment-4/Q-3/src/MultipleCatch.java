/*
    Name-Yash Gohil
    ID-21CE034
    Aim - Write a program that raises two exceptions. Specify two ‘catch’
    clauses for the two exceptions. Each ‘catch’ block handles a different
    type of exception. For example the exception could be ‘ArithmeticException’
    and ‘ArrayIndexOutOfBoundsException’. Display a message in the ‘finally’ block.
 */

public class MultipleCatch
{
    public static void main(String[] args)
    {
        String s = null;
        try
        {
            System.out.println("Inside try block...");
            System.out.println(s.charAt(1));
        }
        catch(StringIndexOutOfBoundsException e1)
        {
            System.out.println(e1);
        }
        catch(NullPointerException e2)
        {
            System.out.println(e2);
        }
        finally
        {
            System.out.println("In the finally block...");
        }
    }
}
