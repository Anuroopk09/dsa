package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Example11
{
    static boolean validParentheses(String str)
    {
        Map<Character,Character> m1 = new HashMap<>();
        m1.put(')','(');
        m1.put('}','{');
        m1.put(']','[');

        Stack<Character> stack  = new Stack<>();
        for(char c: str.toCharArray())
        {
            if(!m1.containsKey(c))
            {
                stack.push(c);
            }
            else
            {
                if(stack.isEmpty()||stack.pop()!=m1.get(c))
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args)
    {
        String str1 = "()[]{}";
        System.out.println(validParentheses(str1));
    }
}
