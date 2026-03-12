package Strings;

import java.util.Arrays;

public class Example2
{
    //longest common prefix
    static String findPrefix(String[] nums)
    {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(nums);
        String first = nums[0];
        String last = nums[nums.length-1];
        for (int i =0;i<=nums.length;i++)
        {
            if(first.charAt(i)!=last.charAt(i))
            {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

    public static void main(String[] args)
    {
        String[] nums = {"interview", "internet", "internal", "interval"};
        String ans = findPrefix(nums);
        System.out.println(ans);

    }
}
