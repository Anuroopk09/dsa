package Arrays;

public class Example19
{
    //kadane's algorithm
    public static int kadane(int[] arr)
    {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    static void main() {
        int[] arr = {-2, -3, -7, -2, -10, -4};
        System.out.println(kadane(arr));
    }
}
