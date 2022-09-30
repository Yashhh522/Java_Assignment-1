/*
    Name-Yash Gohil
    ID-21CE034
    Aim - Write a program to increment the value of one variable by one and
    display it after one second using thread using sleep() method.
 */
class threadSleep extends Thread
{
    int i=0;
    public void threadClass()
    {
        try
        {
            Thread.sleep(1000);
            System.out.println("Value of variable after sleep() method : "+(i+1));
        }
        catch(InterruptedException e)
        {
            System.out.println("Exception");
        }
    }
}
public class sleepMethodEg
{
    public static void main(String[] args)
    {
        threadSleep obj = new threadSleep();
        obj.threadClass();
    }
}
