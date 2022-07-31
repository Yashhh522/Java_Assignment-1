/*
    ID - 21CE034
    Name - Yash Gohil
    Aim - Given an array of ints, return true if the sequence
    of numbers 1, 2, 3 appears in the array somewhere
 */
import java.util.Scanner;

public class Seq123
{
    public static boolean array123(int array[])
    {
        for(int i=0;i<array.length-2;i++)
        {
            if(array[i]==1 && array[i+1]==2 && array[1+2]==3)
                return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array : ");
        int size = sc.nextInt();
        int [] array = new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter element-"+(i+1)+" : ");
            array[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println(array123(array));
    }
}
