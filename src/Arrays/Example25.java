package Arrays;

import java.util.ArrayList;

public class Example25
{
    //leaders in an array
    static ArrayList<Integer> leaders(int[] arr)
    {
        int prefix=0;

        ArrayList<Integer> result = new ArrayList<>();

        for (int i =0;i<arr.length;i++)
        {
            prefix= prefix+arr[i];
        }
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i] >= prefix-arr[i])
            {
               result.add(arr[i]);
            }

            prefix = prefix - arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        System.out.println(leaders(arr));
    }
}
