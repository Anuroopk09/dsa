package Arrays;

import java.util.Arrays;
import java.util.Map;

public class Example33
{
    //Maximum closest sum
    public static void main(String[] args)
    {
        int[] arr = {10,30,20,5};

        int target = 25;
        int maximumClosestSum = Integer.MIN_VALUE;
        int sum = 0;
        int result[] = {0,0};

        for(int i=0; i < arr.length; i++)
        {
            for(int j=i+1; j < arr.length; j++)
            {
                sum = arr[i] + arr[j];
                if(sum <= target)
                {
                    maximumClosestSum = Math.max(maximumClosestSum,sum);
                    result[0] = arr[i];
                    result[1] = arr[j];
                }
            }
        }

        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    }
}
