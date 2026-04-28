package Strings;

import java.util.ArrayList;
import java.util.List;

class Example21 {
    static List<String> letterCombinations(String digits) {
        List<String> r = new ArrayList<>(); if (digits == null || digits.length() == 0) return r;
        String[] m = 
        {
            "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
        };
        f(r, digits, m, 0, new StringBuilder()); return r;
    }
    static void f(List<String> r, String d, String[] m, int i, StringBuilder c)
    {
        if (i == d.length()) 
        { 
            r.add(c.toString()); return; 
        }
        String s = m[d.charAt(i) - '0'];
        for (int j = 0; j < s.length(); j++) 
        { 
            c.append(s.charAt(j)); f(r, d, m, i + 1, c); c.deleteCharAt(c.length() - 1);
        }
    }

    public static void main(String[] args)
    {
        System.out.println(letterCombinations("23"));


    }
}