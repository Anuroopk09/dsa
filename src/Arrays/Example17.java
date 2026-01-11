package Arrays;

public class Example17 {
    //majority element
    public static int majorityElement(int[] arr)
    {
        int n = arr.length/2;
        for (int i = 0;i<arr.length;i++)
        {
            int count = 0;
            for (int j =i;j<arr.length;j++)
            {
                if(arr[j]==arr[i])
                {
                    count++;
                }
                if (count>n)
                {
                    return arr[j];
                }
            }
        }
        return -1;
    }
     static void main(String[] args)
     {
        int[] arr = {1,1,1,2,1,2,2};
        int majority = majorityElement(arr);
        System.out.println(majority);

    }
}
