package Strings;

import java.util.*;

public class Example7
{
    //unique characters in a String
    static char[] frequencyCounter(String str)
    {
        Map<Character,Integer> m1 = new HashMap<>();
        for (int i =0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(m1.containsKey(ch))
            {
                m1.put(ch,m1.get(ch)+1);
            }
            else
            {
                m1.put(ch,1);
            }
        }
        List<Character> l1 = new ArrayList<>(m1.keySet());
        Collections.sort(l1);
        char[] result = new char[l1.size()];
        for (int i =0;i<l1.size();i++)
        {
            result[i] = l1.get(i);
        }
        return result;
    }

    public static void main(String[] args)
    {
        String str1 = "tree";
        System.out.println(frequencyCounter(str1));


    }
}
