package Strings;

public class Example1
{
    //largest odd number in a string
    static String largeOddNumber(String str1)
    {
        for(int i = str1.length()-1; i >= 0; i--)
        {
            if((str1.charAt(i) - '0') % 2 == 1)
            {
                return str1.substring(0, i+1);
            }
        }

        return "";
    }

    public static void main(String[] args)
    {
        String str1 = "5347";
        String ans = largeOddNumber(str1);
        System.out.println(ans);
    }
}