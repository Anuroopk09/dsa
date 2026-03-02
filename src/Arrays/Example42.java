package Arrays;

public class Example42
{
    //count occurrences using linear search
    static int countOcc(int[] arr,int target)
    {
        int count=0;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==target)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        int[] arr = {2, 2, 3, 3, 3, 3, 4};
        int target = 3;
        int ans = countOcc(arr,target);
        System.out.println(ans);


    }
}
