package Arrays;

import java.util.Arrays;

public class Example41
{
    //first and last occurance using optimal approach
    static int firstOcc(int[] arr, int target)
    {
        int low =0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high)
        {
            int mid =(low+high)/2;
            if (arr[mid]==target)
            {
                ans = mid;
                high = mid-1;    //search on the left side for first occ
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

    static String finalAns(int arr[],int target)
    {
        int[] arr2 =new int[2];
        arr2[0] = firstOcc(arr,target);
        arr2[1] = lastOcc(arr,target);
        return Arrays.toString(arr2);
    }

    public static void main(String[] args)
    {
        int[] arr= {3, 4, 13, 13, 13, 20, 40};
        int target= 13;
        System.out.println(finalAns(arr,target));
    }
}
