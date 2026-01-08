package Arrays;

import java.util.HashSet;

public class Example7 {
    //remove duplicates from sorted array
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,4,5,5};
        int arr2[] = new int[arr.length];

        int j = 0;
        for (int i =0;i<arr.length-1;i++)
        {
            if (arr[i]!=arr[i+1])
            {
                arr2[j++]=arr[i];
            }
        }
        arr2[j++]=arr[arr.length-1];

        for (int k = 0; k < j; k++) {
            System.out.print(arr2[k] + " ");
        }
        System.out.println();

        //to hashset
        HashSet<Integer> set = new HashSet<>();
        for (int i =0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        System.out.println(set);




    }
}
