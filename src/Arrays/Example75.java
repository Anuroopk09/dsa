package Arrays;

class Example75 {
    //maximum total subarray value
    static long maxTotalValue(int[] nums, int k)
    {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int num : nums)
        {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return 1L * (max - min) * k;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,3,2};
        int k =2;
        System.out.println(maxTotalValue(arr,k));
    }
}