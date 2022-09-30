/*
    Name-Yash Gohil
    ID-21CE034
    Aim - Write a program to create thread which display “Hello World” message by extending Thread class.
 */
class testThread extends Thread
{
    public void run()
    {
        System.out.println("Hello World");
    }
}
public class threadEg
{
    public static void main(String[] args)
    {
        testThread obj = new testThread();
        obj.run();
    }
}
