package Arrays;

public class Example55
{
    public static void main(String[] args)
    {
        int x = 121;
        int original = x ;
        int res = 0;
        while(x!=0)
        {
            res = res*10+x%10;
        }
        if(res==original)
        {
            System.out.println(true);
        }
        System.out.println(false);
    }
}
