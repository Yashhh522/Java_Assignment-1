import java.util.Scanner;
/*
    Name-Yash Gohil
    ID-21CE034
    Aim - Generate 15 random numbers from 1 to 100 and store it in an int array.
    Write a program to display the numbers stored at odd indexes by thread1 and
    display numbers stored at even indexes by thread2.
 */
class even extends Thread
{
    int [] array = new int [15];
    even(int array[])
    {
        this.array = array;
    }
    public void evenNo()
    {
        for(int i=0;i<15;i=i+1)
        {
            if(i%2==0)
            {
                System.out.println("Even-Index : "+array[i]);
            }
        }
    }
}
class odd extends Thread
{
    int [] array = new int [15];
    odd(int array[])
    {
        this.array = array;
    }
    public void oddNo()
    {
        for(int i=0;i<15;i=i+1)
        {
            if(i%2==0)
            {
                System.out.println("Odd-Index : "+array[i]);
            }
        }
    }
}
public class multipleThread
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [15];
        System.out.println("Enter the elements : ");
        for(int i=0;i<15;i++)
        {
            arr[i] = sc.nextInt();
        }
        even obj1 = new even(arr);
        odd obj2 = new odd(arr);
        obj1.evenNo();
        obj2.oddNo();
    }
}
