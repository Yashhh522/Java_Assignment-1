/*
    ID-21CE034
    Name-Yash Gohil
    Aim - Write a program that illustrates the significance of interface default method
*/
interface defaultInterface
{
    default void run()
    {
        System.out.println("Default method executed...");
    }
}
public class testInterface
{
    public static void main(String[] args)
    {
        defaultInterface obj = new defaultInterface()
        {
            public void run()
            {
                defaultInterface.super.run();
            }
        };
    }
}
