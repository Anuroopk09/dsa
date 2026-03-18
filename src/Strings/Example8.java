package Strings;

public class Example8
{
    //maximum occurring character in a string
    static char getMax(String str)
    {
        int maxCount = 0;
        char maxChar= ' ';
        for (int i=0;i<str.length();i++)
        {
            int frequency =1;
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    frequency++;
                }
                if(frequency>maxCount)
                {
                    maxCount = frequency;
                    maxChar = str.charAt(j);
                }
            }
        }
        return maxChar;
    }
    public static void main(String[] args)
    {
        String str1 ="geeksforgeeks";
        System.out.println(getMax(str1));
    }
}
