package Arrays;

public class Example53
{
    //target root finder using binary search
    static int rootFinder(int x, int n)
    {
        int low = 1;
        int high = x;

        while (low <= high)
        {
            int mid = (low + high) / 2;
            long ans = 1;

            for (int i = 0; i < n; i++)
            {
                ans *= mid;
                if (ans > x)
                {
                    break;
                }
            }

            if (ans == x)
            {
                return mid;
            }
            else if (ans < x)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args)
    {
        int x = 27;
        int n = 3;

        int ans = rootFinder(x, n);
        System.out.println(ans);
    }
}