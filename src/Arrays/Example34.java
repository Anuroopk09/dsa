package Arrays;

public class Example34
{
    //binary search on sorted array
    static int binarySearch(int[] arr,int target)
    {
        int n=arr.length;
        int low = 0;
        int high =n-1;

        while(low<=high)
        {
            int mid= (low+high)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if (arr[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high =mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr ={3,4,6,7,9,12,16,17};
        int target = 6;
        int index =binarySearch(arr,target);
        System.out.println(index);


    }
}
