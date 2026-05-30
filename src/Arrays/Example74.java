package Arrays;

class Example74
{
    static int minElement(int[] nums)
    {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) 
        {
            int temp = 0;
            int num = nums[i];

            while (num > 0) 
            {
                temp += num % 10;
                num /= 10;
            }
            min = Math.min(min, temp);
        }
        return min;
    }

    public static void main(String[] args) {
        int[] nums = {32,12,34,65,13};
        int ans = minElement(nums);
        System.out.println(ans);

    }

}