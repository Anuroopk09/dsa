package Arrays;
import java.util.*;
public class Example15 {
    //three sum problem optimal solution
    public static void main(String[] args) {
        int[] arr = {2,7,11,15,-2,4};
        int target  =20;
        Arrays.sort(arr);
       for (int i=0;i<arr.length-2;i++)
       {
           int left = i+1;
           int right= arr.length-1;
           while(left < right)
           {
               int sum =arr[i]+arr[left]+arr[right];
               if (sum==target)
               {
                   System.out.println(arr[i]+","+arr[left]+","+arr[right]);
                   left++;
                   right--;
               }
               else if (sum<target)
               {
                   left++;
               }
               else
               {
                   right--;
               }
           }


       }




    }
}
