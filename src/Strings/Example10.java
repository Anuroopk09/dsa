package Strings;

import java.util.*;

public class Example10
{
    static int[] findMaxMin(String str)
    {
        if(str.length()==0||str.length()==1)
        {
            return new int[]{0,0};
        }

        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 26; i++)
        {
            if (freq[i] > 0)
            {
                if (freq[i] < min) min = freq[i];
                if (freq[i] > max) max = freq[i];
            }
        }

        return new int[]{min, max};
    }

    static int beautifyString(String str)
    {
        int totalSum = 0;

        for(int i=0;i<str.length();i++)
        {
            for(int j =i;j<str.length();j++)
            {
                String substring = str.substring(i,j+1);
                int[] result = findMaxMin(substring);
                int min = result[0];
                int max = result[1];
                totalSum += Math.abs(min-max);
            }
        }
        return totalSum;
    }

    public static void main(String[] args)
    {
        String str="aabcbaa";
        System.out.println(beautifyString(str));
    }
}