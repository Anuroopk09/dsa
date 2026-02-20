package Arrays;

public class Example39
{
    public static int floorFinder(int[] arr,int x)
    {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (arr[mid] <= x)
            {
                ans = arr[mid];
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return ans;
    }
    public static int ceilFinder(int[] arr,int x)
    {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid] >= x)
            {
                ans = arr[mid];
                high = mid - 1;
            }
            else
            {
                low = mid+1;
            }
        }
        return ans;
    }
    public static void floorAndCeilFinder(int[] arr,int x)
    {
        System.out.println(floorFinder(arr,x));
        System.out.println(ceilFinder(arr,x));
    }
    public static void main(String[] args)
    {
        int[] arr= {3,4,4,7,8,10};
        int target =5;
        floorAndCeilFinder(arr,target);
    }
}
