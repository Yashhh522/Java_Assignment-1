class RegularPolygon
{
    int n = 3;
    double side = 1.00;
    double x = 0;
    double y = 0;
    RegularPolygon()
    {
        System.out.println("The Regular polygon Is : ");
        System.out.println("The Polygon centered at (" + x + "," + y + ")");
        System.out.println("The default Perimeter of Polygon is : " + getPerimeter());
        System.out.println("The default Area of Polygon is : " + getArea());
        System.out.println();
    }
    int getNos()
    {
        System.out.println("The Number Of side is : " + n);
        return n;
    }
    void setNos(int n)
    {
        this.n = n;
    }
    void getlos()
    {
        System.out.println("The Length Of side is : " + side);
    }
    void setlos(Double side)
    {
        this.side = side;
    }
    public void getx()
    {
        System.out.println("The value of x is : " + x);
    }
    public void setx(Double x)
    {
        this.x = x;
    }
    public void gety()
    {
        System.out.println("The value of y is : " + y);
    }
    public void sety(Double y)
    {
        this.y = y;
    }
    double getPerimeter()
    {
        double perimeter = n * side;
        return perimeter;
    }
    double getArea()
    {
        double angle = Math.toRadians(180 / n);
        angle = Math.tan(angle);
        double area = ((side * side * n) / (4 * angle));
        return area;
    }
}
public class c02 extends RegularPolygon
{
    public static void main(String[] args)
    {
        RegularPolygon obj = new RegularPolygon();
        obj.setNos(7);
        obj.getNos();
        obj.setlos(10.15);
        obj.getlos();
        obj.setx(3.00);
        obj.getx();
        obj.sety(6.00);
        obj.gety();
        System.out.println("The perimeter of given input : " + obj.getPerimeter());
        System.out.println("The area of given input : " + obj.getArea());
        System.out.println("\nPrepared by : 21CE034_Yash Gohil");
    }
}
