package Arrays;

public class Example24
{
    //Print The Inversion Pairs
    // Inversion Pair: i < j && A[i] < A[j]

    public static void main(String[] args) {

        int[] nums = {2,4,1,3,5};
        int count = 0;

        for(int i=0; i < nums.length-1; i++)
        {
            for(int j=i+1; j < nums.length; j++)
            {
                if(i < j && nums[i] > nums[j])
                {
                    count++;
                    System.out.println(nums[i] + "..." + nums[j]);
                }
            }
        }

        System.out.println(count);

    }

}
