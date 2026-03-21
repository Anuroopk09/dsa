package Strings;

import java.util.*;

public class Example9
{
    static int[] findMaxMin(String str)
    {
        if(str.length()==0||str.length()==1)
        {
            return new int[]{0,0};
        }
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if (map.containsKey(ch))
            {
                map.put(ch, map.get(ch) + 1);
            }
            else
            {
                map.put(ch, 1);
            }
        }

        Integer[] arr = map.values().toArray(new Integer[0]);
        Arrays.sort(arr);

        int min = arr[0];
        int max = arr[arr.length - 1];

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
