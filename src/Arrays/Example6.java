package Arrays;

import java.util.ArrayList;

public class Example6 {
    //shift all zeros towards the end
    public static void main(String[] args) {
        int[] arr = new int[]{3, 6, 0, 1, 0, 5, 0, 3};
        ArrayList<Integer> arr2 = new ArrayList<>();
        int count = 0;

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] != 0) {
                arr2.add(arr[i]);
            }
        }

        int zeroCount = arr.length - arr2.size();
        for (int i = 0; i < zeroCount; i++) {
            arr2.add(0);
        }

        for(int j = 0; j < arr2.size(); ++j) {
            System.out.print(arr2.get(j)+" ");
        }

        System.out.println();
    }

}
