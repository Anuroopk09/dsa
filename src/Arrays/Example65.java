package Arrays;

class Example65 {
    static void rotate(int[] nums, int k)
   {
        int n = nums.length;
        k = k % n; 
        for (int i = 0; i < k; i++) 
        {
            rotateOnce(nums);
        }
    }

    static void rotateOnce(int[] nums)
    {
        int last = nums[nums.length - 1];
        for (int i = nums.length - 1; i > 0; i--) 
        {
            nums[i] = nums[i - 1];
        }
        nums[0] = last;
    }
    static void printArr(int[] nums)
    {
        for(int i =0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,5,6};
        rotate(nums,3);
        printArr(nums);
    }


}