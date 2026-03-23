package Strings;

import java.util.HashMap;
import java.util.Map;

public class Example6
{
    static boolean isomorphicString(String str1, String str2)
    {
        if(str1.length() != str2.length())
        {
            return false;
        }

        Map<Character, Character> m1 = new HashMap<>();
        Map<Character, Character> m2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++)
        {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            if(m1.containsKey(c1))
            {
                if(!m1.get(c1).equals(c2))
                {
                    return false;
                }
            }
            else
            {
                m1.put(c1, c2);
            }

            if(m2.containsKey(c2))
            {
                if(!m2.get(c2).equals(c1))
                {
                    return false;
                }
            }
            else
            {
                m2.put(c2, c1);
            }
        }

        return true;
    }

    public static void main(String[] args)
    {
        String str1 = "paper";
        String str2 = "title";

        System.out.println(isomorphicString(str1, str2));
    }
}