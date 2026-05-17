package Arrays;

class Example71 {
    static int findMin(int[] nums)
    {
        int left = 0, right = nums.length - 1;
        while (left < right) 
        {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) 
            {
                left = mid + 1;
            } 
            else if (nums[mid] < nums[right]) 
            {
                right = mid;
            } 
            else 
            {
                right--;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5};
        System.out.println(findMin(nums));
    }
}