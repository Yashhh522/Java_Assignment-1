import java.util.Scanner;
public class c03
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Account[] acc = new Account[10];
        acc[0] = new Account();
        int i=0;
        while(true)
        {
            System.out.print("Enter the ID: ");
            int checker = sc.nextInt();
            if (checker>=0 && checker<10)
            {
                acc[i].setID(checker);
                break;
            }
            else
            {
                System.out.println("Enter valid input: ");
            }
        }
        while (true)
        {
            int choice;
            System.out.println("\n\nEnter your choice: ");
            System.out.println("1.Balance Inquiry");
            System.out.println("2.Withdraw money [Maintain minimum balance 300₹]");
            System.out.println("3.Deposit money");
            System.out.println("4.Exit");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("Your balance: " +acc[i].getBalance());
                    break;
                case 2:
                    System.out.println("Enter amount to be withdrawn : ");
                    double amtwith = sc.nextDouble();
                    if (!(acc[0].getBalance() - amtwith < 300))
                    {
                        acc[i].withdraw(amtwith);
                        break;
                    }
                    else
                    {
                        System.out.println("Enter valid input...");
                        break;
                    }
                case 3:
                    System.out.println("Enter Amount to be deposited : ");
                    acc[i].deposit(sc.nextDouble());
                    break;
                case 4:
                    System.out.println("Thank You...");
                    System.exit(0);
                    break;
            }
            System.out.println("\nPrepared by 21CE034_Yash Gohil");
        }
    }
}
