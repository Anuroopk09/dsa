package Strings;

public class Example12
{
    //valid palindrome
    static boolean isPalindrome(String str)
    {
        int low = 0;
        int high = str.length() - 1;

        while(low < high)
        {
            if(str.charAt(low)!=str.charAt(high))
            {
                return false;
            }
            low++;
            high--;

        }
        return true;
    }
    public static void main(String[] args)
    {
        String str = "jaraj";
        System.out.println(isPalindrome(str));
    }
}
