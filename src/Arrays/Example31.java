package Arrays;

public class Example31 {
    static void printSubArrayWithSumZero(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            int sum = 0;

            for (int j = i; j < arr.length; j++)
            {
                sum += arr[j];

                if (sum == 0)
                {

                    for (int k = i; k <= j; k++)
                    {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {6, -2, 2, -8, 1, 7, 4, -10};
        printSubArrayWithSumZero(arr);
    }
}