package Math;

public class Example1
{
    //check whether power of three or not
    static boolean isPowerOfThree(int n)
    {
        if(n==0)
        {
            return false;
        }
        while(n%3==0)
        {
            n = n/3;
        }
        return n==1;
    }

    public static void main(String[] args) {
        int n =729;
        System.out.println(isPowerOfThree(n));
    }
}
