/*
    Name-Yash Gohil
    ID-21CE034
    Aim - Write a program to solve producer-consumer problem using thread Synchronization.
 */
class threadclass extends Thread
{
    int salary=0;
    public void display()
    {
        synchronized(this)
        {
            for(int i=0;i<12;i=i+1)
            {
                salary = salary + 10000;
            }
            this.notify();
        }
    }
}
public class threadSynchronization
{
    public static void main(String[] args)
    {
        threadclass obj1 = new threadclass();
        threadclass obj2 = new threadclass();
        threadclass obj3 = new threadclass();
        obj1.display();
        obj2.display();
        obj3.display();
        try
        {
            synchronized (obj1)
            {
                obj1.wait(1000);
            }
            synchronized (obj2)
            {
                obj2.wait(2000);
            }
            System.out.println("Salary of first employee : "+obj1.salary);
            System.out.println("Salary of second employee : "+obj2.salary);
            System.out.println("Salary of third employee : "+obj3.salary);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
