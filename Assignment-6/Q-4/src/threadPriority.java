/*
    Name-Yash Gohil
    ID-21CE034
    Aim - Write a program to create three threads ‘FIRST’, ‘SECOND’, ‘THIRD’.
    Set the priority of the ‘FIRST’ thread to 3, the ‘SECOND’ thread to 5(default)
    and the ‘THIRD’ thread to 7.
 */
public class threadPriority extends Thread
{
        public void display()
        {
            System.out.println("Inside display function...");
        }
    public static void main(String[] args)
    {
        threadPriority obj1 = new threadPriority();
        threadPriority obj2 = new threadPriority();
        threadPriority obj3 = new threadPriority();
        System.out.println("Before setting priority : ");
        System.out.println("obj1 Thread-priority : "+obj1.getPriority());
        System.out.println("obj2 Thread-priority : "+obj2.getPriority());
        System.out.println("obj3 Thread-priority : "+obj3.getPriority());
        System.out.println();
        obj1.setPriority(3);
        obj2.setPriority(5);
        obj3.setPriority(7);
        System.out.println("After setting priority : ");
        System.out.println("obj1 Thread-priority : "+obj1.getPriority());
        System.out.println("obj2 Thread-priority : "+obj2.getPriority());
        System.out.println("obj3 Thread-priority : "+obj3.getPriority());
    }
}
