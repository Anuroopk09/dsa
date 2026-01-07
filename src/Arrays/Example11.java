package Arrays;

public class Example11 {
    //length of Longest Subarray with given Sum K
    public static void main(String[] args) {
        int[] arr = {10,5,2,7,1,9};
        int sum = 15;
        int length = 0;
        for (int i=0;i<arr.length;i++)
        {
            for (int j = i;j<arr.length;j++)
            {
                int currentSum = 0;
                for (int k = i;k<=j;k++)
                {
                    currentSum+=arr[k];
                }
                if (currentSum ==sum)
                {
                    length = Math.max(length,j-i+1);
                }
            }
        }
        System.out.println(length);
    }
}
