package Strings;

public class Example4
{
    // reverse a string
    static String reverseString(String str)
    {
        char[] chars = str.toCharArray();
        int low = 0;
        int high = str.length() - 1;
        char temp;

        while(low < high)
        {
            temp = chars[low];
            chars[low] = chars[high];
            chars[high] = temp;

            low++;
            high--;
        }

        return new String(chars);
    }

    public static void main(String[] args)
    {
        String str1 = "BYTEFORCE";
        String ans = reverseString(str1);
        System.out.println(ans);
    }
}