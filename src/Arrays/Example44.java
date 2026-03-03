package Arrays;

public class Example44
{
    //search element in rotated sorted array linear search
    static int searchElement(int[] arr, int target)
    {
        for (int i =0;i<arr.length;i++)
        {
            if (arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr ={4, 5, 6, 7, 0, 1, 2};
        int target =0;
        int ans = searchElement(arr,target);
        System.out.println(ans);


    }
}
