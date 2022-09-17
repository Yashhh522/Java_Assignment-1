/*
    Id-21CE034
    Name-Yash Gohil
    Aim - WAP that illustrate the interface inheritance. Interface P
    is extended by P1 and P2 interfaces. Interface P12 extends both P1
    and P2. Each interface declares one method and one constant. Create
    one class that implements P12. By using the object of the class
    invokes each of its method and displays constant.
 */
interface P
{
    int P=1;
    void P();
}
interface P1 extends P
{
    int P1 = 10;
    void P1();//Prints P1
}
interface P2 extends P
{
    int P2 = 20;
    void P2();
}
interface P12 extends P1,P2
{
    int P12 = 120;
    void P12();
}
class Q implements P12
{
    public void P12()
    {
        System.out.println(P12);
    }
    public void P2()
    {
        System.out.println(P2);
    }
    public void P1()
    {
        System.out.println(P1);
    }
    public void P()
    {
        System.out.println(P);
    }
}
public class interfaceInheritance
{
    public static void main(String[] args)
    {
        Q q = new Q();
        q.P();
        q.P1();
        q.P2();
        q.P12();
    }
}
