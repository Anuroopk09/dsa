package Arrays;

import java.util.Arrays;

public class Example56
{
    //plus one
    static String plusOne(int[] nums)
    {
        for(int i =nums.length-1;i>=0;i++)
        {
            if(nums[i]>0)
            {
                 nums[i]++;
                 return Arrays.toString(nums);
            }
            else
            {
                nums[i]=0;
            }
        }
        int[] result = new int[nums.length+1];
        result[0]=1;
        return Arrays.toString(result);
    }

    public static void main(String[] args)
    {
        int[] nums = {1,2,4};
        System.out.println(plusOne(nums));

    }
}
