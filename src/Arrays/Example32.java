package Arrays;

import java.util.Arrays;

public class Example32
{
    //bubble-sort
    public static void main(String[] args)
    {
        int[] arr = {13,46,24,52,20,9};
        boolean isSorted = true;
        int temp;

        for (int i=0; i<arr.length; i++)
        {
            for(int j=0; j < arr.length - i -1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    isSorted = false;
                }
            }

            if(isSorted)
            {
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
