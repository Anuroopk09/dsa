package Strings;

import java.util.ArrayList;
import java.util.List;

public class Example5
{
    static String reverseWords(String str)
    {
        int n = str.length();
        List<String> l = new ArrayList<>();
        int start = -1;
        int last = -1;
        int i = 0;

        while(i < n)
        {
            while(i < n && str.charAt(i) == ' ')
            {
                i++;
            }

            if(i >= n)
            {
                break;
            }

            start = i;

            while(i < n && str.charAt(i) != ' ')
            {
                i++;
            }

            last = i;

            String s = str.substring(start,last);
            l.add(s);
        }

        String result = "";

        for(int j = l.size() - 1; j >= 0; j--)
        {
            result = result + l.get(j);

            if(j != 0)
            {
                result = result + " ";
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        String str1 = "AMAZING CODING SKILLS";
        System.out.println(reverseWords(str1));
    }
}