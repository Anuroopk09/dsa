package Arrays;

public class Example28
{
    public static int maxSum(int[] arr)
    {
        int target = 6;
        boolean found = false;

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                int sum = arr[i] + arr[j];

                if (sum == target)
                {
                    System.out.println(arr[i] + " .. " + arr[j]);
                    found = true;
                }
            }
        }

        return found ? target : -1;
    }
    public static void main(String[] args)
    {
        int[] arr = {3,1,2,4};
        System.out.println(maxSum(arr));
    }
}
