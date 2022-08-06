/*
    ID - 21CE034
    Name - Yash D. Gohil
    Aim - To design a class named Circle and add the attributes given in the question
 */
class testCircle
{
    double radius=1;
    testCircle()
    {

    }
    testCircle(double r)
    {
        radius = r;
    }
    double getArea()
    {
        return (3.14*(radius)*(radius));
    }
    double getPerimeter()
    {
        return (2*(3.14)*radius);
    }
}
public class Circle {
    public static void main(String [] args)
    {
        testCircle C = new testCircle();
        C = new testCircle(2.5);
        System.out.println("Area = "+C.getArea());
        System.out.println("Perimeter = "+C.getPerimeter());
    }
}
