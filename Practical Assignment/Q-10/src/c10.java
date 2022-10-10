class square
{
    protected double side1;
    public double get_side1()
    {
        return side1;
    }
    public void set_side1(double side1)
    {
        this.side1 = side1;
    }
    public void area1()
    {
        System.out.println("The square area : ");
        System.out.println("Area = " + this.side1 * this.side1);
    }
}
class ComparableSquare extends square implements Comparable
{
    protected double side2;
    public int compareTo(Object o)
    {
        if (o.equals(this))
            return 1;
        else
            return 0;
    }
    public double get_side2()
    {
        return side2;
    }
    public void set_side2(double side2)
    {
        this.side2 = side2;
    }
    public void area2()
    {
        System.out.println();
        System.out.println("The ColorableSquare area : ");
        System.out.println("Area = " + this.side2 * this.side2);
    }
}
public class c10
{
    public static void main(String[] args)
    {
        square s = new square();
        ComparableSquare Cs = new ComparableSquare();
        s.set_side1(10);
        Cs.set_side2(20);
        s.area1();
        Cs.area2();
        System.out.println(Cs.compareTo(s));
        System.out.println();
        System.out.println("Prepared by : 21CE034_Yash Gohil");
    }
}
