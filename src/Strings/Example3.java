package Strings;

public class Example3
{
    //anagrams of strings
    static boolean anagramsOfString(String str1,String str2)
    {
       if(str1.length()!=str2.length())
       {
           return false;
       }
       int[] arr=new int[26];
       for(int i= 0;i<str1.length();i++)
       {
           arr[str1.charAt(i)-'A']++;
       }
       for(int i= 0;i<str2.length();i++)
       {
           arr[str2.charAt(i)-'A']--;
       }
        for (int i = 0; i < 26; i++)
        {
            if (arr[i] != 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        String s ="CAT";
        String t = "ACT";
        Boolean ans = anagramsOfString(s,t);
        System.out.println(ans);
    }
}
