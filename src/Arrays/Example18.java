package Arrays;

public class Example18 {
    //majority element using boyer-moore algorithm
    public static int majorityElement(int[] arr)
    {
        int count = 0;
        int candidate = -1;
        for (int i =0;i<arr.length;i++)
        {
            if (count == 0)
            {
                candidate = arr[i];
                count = 1;
            }
            else
            {
                if (arr[i] == candidate)
                {
                    count++;
                }
                else
                {
                    count--;
                }
            }
        }
        count = 0;
        for (int i = 0;i<arr.length;i++)
        {
            if (arr[i]==candidate)
            {
                count++;
            }
            if (count>arr.length/2)
            {
                return arr[i];
            }
        }

        return -1;
    }
    static void main() {
        int arr[] = {1,1,1,1,2,3,5};
        int majority = majorityElement(arr);
        System.out.println(majority);
    }
}
