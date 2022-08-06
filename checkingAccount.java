/*
    ID - 21CE034
    Name - Yash D. Gohil
    Aim - Create  two  subclasses  for  checking  and  saving  accounts
 */

import java.util.Date;
import java.util.Scanner;

class Account {
    private String id;
    private double balance = 500;
    private double interestRate = 7;
    private Date dateCreated;
    Account() {
    }
    Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }
    public void set_id(String id) {
        this.id = id;
    }
    public String get_id() {
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
class savingAccount extends Account{
    double overdraft = 0;
    public savingAccount(String id, double newBal) {
        super(id, newBal);
    }
    public void checkOverdraw (double j) {
        if (get_balance() - j < overdraft)
            System.out.println("Insufficient Funds");
        else
            set_balance(get_balance()-j);
    }
}
class accountChecking extends Account {
    double overDraft = -1000;

    public accountChecking(String id, double newBal) {
        super(id, newBal);
    }
    public void checkOverdraft(double i) {

        if (get_balance() - i < overDraft){
            System.out.println("Failure: Can't overdraft more than Rs1,000” + " +
                    "A Rs 101 overdraft fee will be issued to your account. ");
            set_balance(get_balance()-101);
        }
        else
            set_balance(get_balance()-i);
    }
}

public class checkingAccount
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        accountChecking check = new accountChecking("ACC006",10000);
        savingAccount saving = new savingAccount("ACC007",15000);
        saving.checkOverdraw(5000);
        check.checkOverdraft(15000);
        System.out.println("Balance after withdraw : "+check.get_balance());
        System.out.println("Balance after deposit : "+saving.get_balance());
    }
}
