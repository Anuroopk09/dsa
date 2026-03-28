package Arrays;

import java.util.HashSet;
import java.util.Set;

public class Example57
{
    //intersection of arrays
    static int[] intersection(int[] nums1, int[] nums2)
    {
        Set<Integer> set = new HashSet<>();
        for(int i =0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    set.add(nums1[i]);
                }
            }
        }
        int[] result = new int[set.size()];
        int index = 0;

        for(int num : set)
        {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args)
    {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(intersection(nums1,nums2));

    }
}
