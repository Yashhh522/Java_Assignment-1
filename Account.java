//21CE034_Yash
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;

class testAccount {
    private int id;
    private double balance = 500;
    private double interestRate = 7;
    private Date dateCreated;

    testAccount() {
    }

    testAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void set_id(int id) {
        this.id = id;
    }

    public int get_id() {
        return id;
    }

    public void set_balance(double balance) {
        this.balance = balance;
    }

    public double get_balance() {
        return balance;
    }

    public void set_rate(double rate) {
        interestRate = rate;
    }

    public double get_rate() {
        return interestRate;
    }

    public void set_date(Date date) {
        dateCreated = date;
    }

    public double monthlyInterestRate() {
        return (interestRate / 12);
    }

    public double monthlyInterest() {
        return (interestRate / 1200) * balance;
    }

    public double withdraw(double amount) {
        balance = balance - amount;
        return balance;
    }

    public double deposit(double amount) {
        balance = balance + amount;
        return balance;
    }
}
public class Account
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        testAccount acc = new testAccount();
        Date date = new Date();
        System.out.print("Enter the id : ");
        int id = sc.nextInt();

        System.out.print("Enter the balance : ");
        double bal = sc.nextDouble();
        System.out.print("Enter the annual Interest-Rate : ");
        double rate = sc.nextDouble();

        System.out.println();
        //acc = new Account(id,bal)
        acc.set_id(id);
        acc.set_balance(bal);
        acc.set_rate(rate);
        System.out.println("Customer ID : "+acc.get_id());
        System.out.println("Current balance : "+acc.get_balance());
        System.out.println("Date of account creation : "+date);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Monthly Interest-Rate : "+df.format(acc.monthlyInterestRate()));
        System.out.println("Monthly Interest : "+df.format(acc.monthlyInterest()));

        System.out.println();
        System.out.print("Enter '1' to deposit money and '2' to withdraw money : ");
        int input = sc.nextInt();

            if (input == 1) {
                System.out.print("Enter the amount : ");
                double amount = sc.nextDouble();
                System.out.println("Total amount after the deposit : " + acc.deposit(amount));
                acc.set_balance(acc.withdraw(amount));
            } else if (input == 2) {
                System.out.print("Enter the amount : ");
                double amount = sc.nextDouble();
                System.out.println("Total amount after withdraw : " + acc.withdraw(amount));
                acc.set_balance(acc.deposit(amount));
            }
    }
}


