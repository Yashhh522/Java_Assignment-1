/*
    Name-Yash Gohil
    ID-21CE034
    Aim - Write a program to create thread which display “Hello World” message by using Runnable interface.
 */
class threadEg2 implements Runnable
{
    public void run()
    {
        System.out.println("Hello World");
    }
}
public class threadMain
{
    public static void main(String[] args)
    {
        threadEg2 obj = new threadEg2();
        obj.run();
    }
}
