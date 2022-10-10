/*
    Name-Yash Gohil
    ID-21CE034
    Aim - WAP to demonstrate methods of wrapper class.
*/
public class WrapperClassEg
{
    public static void main(String[] args)
    {
        Integer I = Integer.valueOf("10");
        System.out.println(I);
        Double D = Double.valueOf("10.0");
        System.out.println(D);
        Boolean B = Boolean.valueOf("true");
        System.out.println(B);
        int i = Integer.parseInt("10");
        double d = Double.parseDouble("10.5");
        boolean b = Boolean.parseBoolean("true");
        System.out.println();
        System.out.println("Object of int value created : "+i);
        System.out.println("Object of double value created : "+d);
        System.out.println("Object of boolean value created : "+b);
        System.out.println();
    }
}
