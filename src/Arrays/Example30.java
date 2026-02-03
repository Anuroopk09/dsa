package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Example30
{
    //majority element in an array(>n/3)
    public static void main(String[] args)
    {
        int[] arr = {1,2,1,1,3,2};
        Map<Integer, Integer> map= new HashMap<>();
        for (int i = 0; i < arr.length; i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()>arr.length/3)
            {
                System.out.println(entry.getValue());
            }



        }

    }
}
