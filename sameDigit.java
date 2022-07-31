/*
    ID - 21CE034
    Name - Yash Gohil
    Aim - To check if the last digit of twp positive integers is same
 */
import java.util.Scanner;
public class sameDigit
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int n1 = obj.nextInt();
        System.out.print("Enter second number : ");
        int n2 = obj.nextInt();
        if(n1<0 || n2<0)        //Checking if numbers are negative
        {
            System.out.println("Error!Enter positive numbers");
        }
        else if(n1%10 == n2%10)     //Checking for last digit of numbers
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
