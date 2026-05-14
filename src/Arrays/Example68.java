package Arrays;

class Example68
{
    //good array
    public static boolean isGood(int[] nums)
    {
        int n = nums.length - 1;
        int[] freq = new int[n + 1];

        for (int num : nums)
        {
            if (num < 1 || num > n) {
                return false;
            }
            freq[num]++;
        }

        for (int i = 1; i < n; i++)
        {
            if (freq[i] != 1) {
                return false;
            }
        }

        return freq[n] == 2;
    }

    public static void main(String[] args)
    {
        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {1, 2, 2, 3};

        System.out.println(isGood(nums1));
        System.out.println(isGood(nums2));
    }
}