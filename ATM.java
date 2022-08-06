
import java.util.Scanner;

public class ATM
{
    public static void main(String [] args)
    {
            testAccount [] account = new testAccount[10];
            Scanner obj = new Scanner(System.in);
            for(int i=0;i<account.length;i++)
            {
                account[i] = new testAccount(i+1,300);
            }
            System.out.print("Enter the ID (001-010) : ");
            int id = obj.nextInt();
            if(id<001 || id>010)
            {
                System.out.println("Incorrect ID, please enter a valid ID...");
            }
        System.out.println("Enter the choice from below : ");
        System.out.println("1.Balance Enquiry\n2.Withdraw Money\n3.Deposit Money\n4.Create Account" +
                "\n5.Money Transfer\n6.Deactivate Account\n7.Exit");
        int choice = obj.nextInt();
        System.out.println();
        switch(choice)
        {
            case 1:
            {
                System.out.println("Current Balance : "+account[id].get_balance());
                break;
            }
            case 2:
            {
                System.out.print("Enter the amount : ");
                double a = obj.nextDouble();
                System.out.println("Balance after withdraw : "+account[id].withdraw(a));
                break;
            }
            case 3:
            {
                System.out.print("Enter the amount : ");
                double a = obj.nextDouble();
                System.out.println("Balance after deposit : "+account[id].deposit(a));
                break;
            }
            case 4:
            {
                System.out.print("Enter name : ");
                String name = obj.next();
                System.out.print("Enter age : ");
                int age = obj.nextInt();
                System.out.print("Enter Date of Birth : ");
                String date = obj.next();
                System.out.print("Enter account type : ");
                String type = obj.next();
                break;
            }
            case 5:
            {
                System.out.print("Enter the amount : ");
                double a = obj.nextDouble();
                System.out.print("Enter the account number : ");
                long ac_name = obj.nextLong();
                break;
            }
            case 6:
            {
                System.out.print("Enter the ID : ");
                int i = obj.nextInt();
                System.out.print("Enter account number : ");
                long ac_name = obj.nextLong();
                break;
            }
            case 7:
            {
                System.out.println("THANK YOU");
                break;
            }
        }
    }
}
