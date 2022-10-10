/*
    Name-Yash Gohil
    ID-21CE034
    Aim - Create a class AccountHolder to store above given information entered by
    a user. Create 5 objects of AccountHolder class and store them in an ArrayList.
    Display names of account holders , who are eligible to get a loan based on given criteria.
 */
import java.util.*;
class AccountHolder
{
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    int exp;
    double inc;
    Boolean czs;
    static void display()
    {
        System.out.println("Kindly fill the form :");
    }
    void info() {
        System.out.print("Enter name : ");
        name = sc.next();
        System.out.print("Enter age : ");
        age = sc.nextInt();
        System.out.print("Enter net-monthly income : ");
        inc = sc.nextDouble();
        System.out.print("Enter total work experience : ");
        exp = sc.nextInt();
        System.out.print("Is your citizenShip Indian?(true/false) : ");
        czs = sc.nextBoolean();
    }
}
public class classTester
{
    public static void main(String[] args)
    {
        int count = 0;
        ArrayList obj = new ArrayList<>();
        ArrayList<AccountHolder> personHolder = new ArrayList<AccountHolder>();
        AccountHolder.display();
        for (int i = 1; i <= 5; i++)
        {
            personHolder.add(new AccountHolder());
        }
        for (AccountHolder p : personHolder)
        {
            p.info();
            if (p.age >= 21 && p.age <= 60 && p.inc >= 15000 && p.exp >= 1 && p.czs == true)
            {
                System.out.println("You are eligible.");
                System.out.println("Your name : " + p.name);
                count++;
                obj.add(p.name);
            }
            else
            {
                System.out.println("You are not eligible.");
            }
            System.out.println();
        }
        System.out.println("The number of eligible candidates : "+count);
        System.out.println("The number of not eligible candidates : "+(5-count));
        System.out.println("All eligible candidates are : "+obj);
    }
}
