import java.util.*;
class queue
{
    Scanner sc = new Scanner(System.in);
    int[] elements = new int[8];
    queue(int n)
    {
        int capacity = n;
        System.out.println("Enter any 8 number: ");
        for (int i = 0; i < capacity; i++)
        {
            elements[i] = sc.nextInt();
        }
    }
    int size;
    void data()
    {
        size = elements.length;
    }
    int enqueue(int v)
    {
        int t = v;
        t = elements[0];
        return t;
    }
    void dequeue()
    {
        for (int i = 0; i < 7; i++)
        {
            elements[i] = elements[i + 1];
        }
    }
    boolean empty()
    {
        return true;
    }
    int getSize()
    {
        return size ;
    }
}
class stack
{
    Scanner sc = new Scanner(System.in);
    int[] elements = new int[8];
    stack(int n)
    {
        int capacity = n;
        System.out.println("Enter any 8 number : ");
        for (int i = 0; i < capacity; i++)
        {
            elements[i] = sc.nextInt();
        }
    }
    int size;
    void data()
    {
        size = elements.length;
    }
    int enqueue(int v)
    {
        int t = v;
        return t;
    }
    void dequeue()
    {
        for (int i = 0; i < 7; i++)
        {
            elements[i] = elements[i + 1];
        }
    }
    boolean empty()
    {
        return true;
    }
    int getSize()
    {
        return size;
    }
}
public class c04
{
    public static void main(String[] args)
    {
        queue q = new queue(8);
        stack s = new stack(8);
        q.enqueue(10);
        q.dequeue();
        System.out.println("For Stack :");
        for (int i = 0; i < 7; i++)
        {
            System.out.println(q.elements[i]);
        }
        s.dequeue();
        System.out.println("For Queue:");
        for (int i = 0; i < 7; i++)
        {
            System.out.println(s.elements[i]);
        }
        System.out.println(s.enqueue(500));
        System.out.println("\nPrepared by : 21CE034_Yash Gohil");
    }
}
