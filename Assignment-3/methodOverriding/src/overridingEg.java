/*
    ID-21CE034
    Name-Yash Gohil
    Aim - Develop a Program that illustrate method overriding concept
 */
class base
{
    void run()
    {
        System.out.println("Base class called...");
    }
}
class derived extends base
{
    void run()
    {
        System.out.println("Derived class called...");
    }
}
public class overridingEg
{
    public static void main(String[] args)
    {
        base b = new base();
        b.run();
        derived d = new derived();
        d.run();
    }
}
