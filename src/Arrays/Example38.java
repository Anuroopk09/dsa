package Arrays;

public class Example38
{
    //find target index of an element
    public static int findTargetIndex(int[] arr,int target)
    {
        int low =0;
        int high = arr.length-1;
        int answer = arr.length;

        while(low<=high)
        {
            int mid = (low+high)/2;

            if (arr[mid]>=target)
            {
                answer= mid;
                high = mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return answer;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,4,7};
        int target = 6;
        int answer = findTargetIndex(arr,target);
        System.out.println(answer);


    }

}
