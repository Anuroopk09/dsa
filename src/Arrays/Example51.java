package Arrays;

public class Example51
{
    static int floorSqrt(int n)
    {
        int ans = 0;

        for(int i=1;i<=n;i++)
        {
            if((long)(i)*i<=n)
            {
                ans =i;
            }
            else
            {
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int n =27;
        int ans = floorSqrt(n);
        System.out.println(ans);
    }
}
