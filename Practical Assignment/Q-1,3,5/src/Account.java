import java.util.Date;
public class Account
{
    private int ID;
    private double Balance;
    private double AnnualInterestRate;
    private final Date dateCreated = new Date();
    public Account()
    {
        System.out.println("Congratulations....new account created....");
        Balance = 100;
        AnnualInterestRate = 0.07;
    }
    public Account(int id, double bal)
    {
        ID = id;
        Balance = bal;
    }
    public int getID()
    {
        return ID;
    }
    public double getBalance()
    {
        return Balance;
    }
    public double getAnnualInterestRate()
    {
        return AnnualInterestRate;
    }
    public Date getDateCreated()
    {
        return dateCreated;
    }
    public void setID(int ID)
    {
        this.ID = ID;
    }
    public void setBalance(double balance)
    {
        Balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate)
    {
        AnnualInterestRate = annualInterestRate;
    }
    public double getMonthlyInterestRate()
    {
        return AnnualInterestRate / 12;
    }
    public double getMonthlyInterest()
    {
        return Balance * getMonthlyInterestRate() * 1;
    }
    public void withdraw(double withdrawAmt)
    {
        Balance -= withdrawAmt;
        System.out.println("Amount withdrew: " + withdrawAmt);
        System.out.println("New balance: " + Balance);
    }
    public void deposit(double depositAmt)
    {
        Balance += depositAmt;
        System.out.println("Amount deposited : ");
        System.out.println("New balance = " + Balance);
    }
    public void Transfer(Account trans, double amt)
    {
        this.Balance -= amt;
        trans.setBalance(trans.getBalance() + amt);
        System.out.println("Amount transferred = ");
    }
    public static void main(String[] args)
    {
        Account acc = new Account();
        acc.setID(1001);
        acc.setBalance(10000);
        System.out.println("Total Balance : " +acc.getBalance());
        System.out.println("ID : " +acc.getID());
        System.out.println("Date Created : "+acc.getDateCreated());
        System.out.println("\nPrepared by : 21CE034_Yash Gohil");
    }
}
