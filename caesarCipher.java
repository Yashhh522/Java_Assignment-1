/*
    ID - 21CE034
    Name - Yash D. Gohil
    Aim - To implement Caesar-Cipher
*/
import java.util.Scanner;

public class caesarCipher
{
    public static StringBuffer cc(String st, int value)
    {
        StringBuffer res = new StringBuffer();
        for(int i=0;i<st.length();i++)
        {
            if(Character.isUpperCase(st.charAt(i)))
            {
                char ch = (char)(((int)st.charAt(i)+value-65) % 26 + 65);
                res.append(ch);
            }
            else
            {
                char ch = (char)(((int)st.charAt(i)+value-97) % 26 + 97);
                res.append(ch);
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter string : ");
        String st = obj.next();
        System.out.print("Enter the value to be shifted : ");
        int value = obj.nextInt();
        System.out.println("Value after using Caesar-Cipher : "+cc(st,value));
    }
}
