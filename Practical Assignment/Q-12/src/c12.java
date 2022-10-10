class Bank
{
    private String name;
    Bank(String name)
    {
        this.name = name;
    }
    public String getBankName()
    {
        return this.name;
    }
}
class Employee
{
    private String name;
    Employee(String name)
    {
        this.name = name;
    }
    public String getEmployeeName()
    {
        return this.name;
    }
}
public class c12
{
    public static void main(String[] args)
    {
        Bank bank = new Bank("BOB");
        Employee emp = new Employee("Random Person...");
        System.out.println(emp.getEmployeeName() + " is employee of " + bank.getBankName());
        System.out.println("\nPrepared by : 21CE034_Yash Gohil");
    }
}
