package Arrays;


public class Example12
{
    //maximum sub-array sum
    public static int maxSum(int[] arr)
    {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++)
        {
            for (int j = i;j<arr.length;j++)
            {
                sum = 0;
                for (int k = i;k<j;k++)
                {
                    sum+=arr[k];
                }
                if (sum>max)
                {
                    max = sum;
                }

            }
        }
        return max;
    }

    static void main()
    {
        int[] arr = {2,3,-8,7,-1,2,3};
        System.out.println(maxSum(arr));
    }

}
