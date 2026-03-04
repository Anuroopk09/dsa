package Arrays;

public class Example45
{
    //rotation count of an array(brute force)
    static int rotated(int[] arr)
    {
        int count=0;
        int minValue=arr[0];
        int minIndex= 0;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]<minValue)
            {
                minValue=arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void main(String[] args)
    {
        int[] arr= {4,5,6,7,0,1,2,3};
        int ans = rotated(arr);
        System.out.println(ans);
    }
}
