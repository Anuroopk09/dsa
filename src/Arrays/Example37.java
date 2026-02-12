package Arrays;

import java.util.Arrays;

public class Example37
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 4, 7};
        int target = 6;

        int[] result = new int[arr.length + 1];

        int i = 0;
        int j = 0;

        while (i < arr.length && arr[i] < target)
        {
            result[j++] = arr[i++];
        }

        result[j++] = target;

        while (i < arr.length)
        {
            result[j++] = arr[i++];
        }

        System.out.println(Arrays.toString(result));
    }
}