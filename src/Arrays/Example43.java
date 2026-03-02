package Arrays;

public class Example43
{
    //count occurrences using binary search
    static int firstOcc(int[] arr,int target)
    {
        int ans= -1;
        int low = 0;
        int high = arr.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if (arr[mid]==target)
            {
                ans = mid;
                high = mid-1;
            }
            else if(arr[mid]<target)
            {
                low = mid+1;
            }
            else
            {
              high = mid-1;
            }
        }
      return ans;
    }
    static int lastOcc(int[] arr, int target)
    {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target)
            {
                ans = mid;
                low=mid+1;
            }
            else if(arr[mid]<target)
            {
                low=mid+1;      //search on the right side
            }
            else
            {
                high = mid-1;   //search on the left side
            }
        }
        return ans;
    }
    public static int count(int[] arr, int target)
    {
        int first = firstOcc(arr,target);
        if(first==-1)
        {
            return -1;
        }
        int last  = lastOcc(arr,target);
        int occ   = (last-first+1);
        return occ;
    }


    public static void main(String[] args)
    {
        int[] arr= {2, 2 , 3 , 3 , 3 , 3 , 4};
        int target = 3;
        System.out.println(count(arr,target));
    }
}
