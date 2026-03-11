package Arrays;

public class Example52
{
    //square root of a number using binary search

    static int floorSquare(int n)
    {
        if(n<2) return n;
        int low = 1;
        int high = n/2;
        int ans = 0;

        while(low<=high)
        {
            long mid = (high+low)/2;
            if(mid*mid<=n)
            {
                ans = (int)mid;
                low = (int)mid+1;
            }
            else
            {
                high = (int)mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int n =28;
        int ans = floorSquare(n);
        System.out.println(ans);
    }
}
