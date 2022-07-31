/*
    ID - 21CE034
    Name - Yash Gohil
    Aim - Display numbers in a pyramid pattern.
 */
import java.text.DecimalFormat;

public class pyramidPattern
{
    public static void pattern(int n)
    {
        DecimalFormat df = new DecimalFormat("####");
        for(int i=0 ; i<n; i++){
            for (int j=n-i; j>0;j--)
            {
                System.out.print(" ");
            }
            for (int j=0;j<i;j++)
            {
                System.out.print((int)(Math.pow(2,j))+" ");
            }
            for (int j=i;j>=0;j--)
            {
                System.out.print((int)(Math.pow(2,j))+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args)
    {
        pattern(8);
    }
}