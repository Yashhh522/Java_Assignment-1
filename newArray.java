/*
    ID - 21CE034
    Name - Yash Gohil
    Aim - Given an array of strings, return a new array without the strings
    that are equal to the target string. One approach is to count the
    occurrences of the target string, make a new array of the correct length,
    and then copy over the correct strings.
 */
public class newArray
{
    public static String[] wordsWithout(String[]s, String array)
    {
        String [] s2 = new String[s.length];
        int i=0;
        for(int j=0;j<s.length;j++)
        {
            if(s[j].compareToIgnoreCase(array) != 0)
            {
                s2[i] = s[j];
                j++;
            }
        }
        return s2;
    }
    public static void main(String[] args)
    {
        String [] s = {"a","b","c","a"};
        String [] array = wordsWithout(s,"c");
        for(int j=0;j<array.length;j++)
        {
            if(array[j] != null)
            {
                System.out.println(array[j]+" ");
            }
        }
    }
}
