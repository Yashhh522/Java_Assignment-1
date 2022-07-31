/*
    ID - 21CE034
    Name - Yash Gohil
    Aim - Given 2 strings, a and b, return the number of the positions
    where they contain the same length 2 substring. So "xxcaazz" and
    "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear
    in the same place in both strings.
 */
import java.util.Scanner;

public class substringLength
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first string : ");
        String s1 = scan.next();
        System.out.print("Enter second string : ");
        String s2 = scan.next();
        int min=0;
        int count=0;
        if(s1.length() < s2.length())
        {
            min = s1.length();
        }
        else if(s1.length() > s2.length())
        {
            min = s2.length();
        }
        else if(s1.length() == s2.length())
        {
            min = s1.length();
        }
        for(int i=0;i<min-1;i++)
        {
            if(s1.charAt(i) == s2.charAt(i)&&s1.charAt(i+1)==s2.charAt(i+1)) //Comparing characters of both strings
            {
                count = count+1;
            }
        }
        System.out.println(count);
    }
}
