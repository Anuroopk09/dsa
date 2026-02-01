package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Example29 {
    //Rearrange Array Elements by Sign

    public static List<Integer> sortArr(int[] arr) {

        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > 0)
            {
                positive.add(arr[i]);
            } else
            {
                negative.add(arr[i]);
            }
        }

        ArrayList<Integer> newArray = new ArrayList<>();

        int p = 0;
        int n = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > 0)
            {
                newArray.add(positive.get(p));
                p++;
            }
            else
            {
                newArray.add(negative.get(n));
                n++;
            }
        }

        return newArray;
    }

    public static void main(String[] args)
    {
        int[] arr = {1, -3, 2, -1, 3, -2};
        System.out.println(sortArr(arr));


    }
}