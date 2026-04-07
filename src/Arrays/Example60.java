package Arrays;

import java.util.HashSet;

public class Example60
{
    //leetcode 575- distribute candies
    static int distributeCandies(int[] candyType)
    {
        HashSet<Integer> set = new HashSet<>();

        for (int candy : candyType)
        {
                set.add(candy);
        }

        return Math.min(set.size(), candyType.length / 2);
    }

    public static void main(String[] args)
    {
        int[] nums = {1,1,2,2,3,3};
        System.out.println(distributeCandies(nums));

    }
}
