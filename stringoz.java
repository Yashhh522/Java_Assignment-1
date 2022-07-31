/*
    ID - 21CE034
    Name - Yash D. Gohil
    Aim - Given a string, return a string made of the first 2 chars (if present),
    however include first char only if it is 'o' and include the second only if
    it is 'z', so "ozymandias" yields "oz".
*/

public class stringoz
{
    public static String startOZ(String st)
    {
        if(st.charAt(0)=='o' && st.charAt(1)=='z')
        {
            return "oz";
        }
        else if(st.charAt(0)=='o')
        {
            return "o";
        }
        else if(st.charAt(1)=='z')
        {
            return "z";
        }
        return "Error";
    }
    public static void main(String[] args)
    {

        String s = new String();
        System.out.println(startOZ("ozymandias"));
        System.out.println(startOZ("bzoo"));
        System.out.println(startOZ("oxx"));
    }
}
