package Arrays;

import java.util.Arrays;

class Example61 {
    static String moveZeroes(int[] nums)
    {
        int j = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        
        while (j < nums.length)
        {
            nums[j] = 0;
            j++;
        }
        return Arrays.toString(nums);
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println(moveZeroes(nums));

    }
}