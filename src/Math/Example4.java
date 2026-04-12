package Math;

public class Example4
{
   static boolean powerOfFour(int n)
    {
        if(n<=0)
        {
            return false;
        }
        while(n%4==0)
        {
            n = n/4;
        }
        return n==1;
    }
    public static void main(String[] args)
    {
        int n = 64;
        System.out.println(powerOfFour(n));
    }
}
