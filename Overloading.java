/*
    ID - 21CE034
    Name - Yash D. Gohil
    Aim - To illustrate Method Overloading
 */
class Adder
{
    static int add(int a,int b)
    {
        return (a+b);
    }
    static double add(int a,double b)
    {
        return (a+b);
    }
    static int add(int a,int b, int c)
    {
        return (a+b+c);
    }
}
public class Overloading
{
    public static void main(String[] args)
    {
        Adder obj = new Adder();
        System.out.println("Addition of given numbers = "+obj.add(3,4));
        System.out.println("Addition of given numbers = "+obj.add(3,3.9));
        System.out.println("Addition of given numbers = "+obj.add(2,3,4));
    }
}
