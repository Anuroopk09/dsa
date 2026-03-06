package Arrays;
import java.util.*;
public class Example48
{
        static int findMinElement(int[] arr)
        {
            int low = 0;
            int high = arr.length-1;

            while(low < high) {
                int mid = (low + high) / 2;

                if(arr[mid] > arr[high])
                    low = mid + 1;
                else
                    high = mid;
            }
            return arr[low];
        }

        static int bruteMin(int[] arr)
        {
            int min = arr[0];
            for(int x : arr) min = Math.min(min, x);
            return min;
        }

        public static void main(String[] args)
        {
            Random r = new Random();

            for(int t = 1; t <= 10000000; t++){
                int n = 10;

                int[] arr = new int[n];
                for(int i=0;i<n;i++) arr[i] = i;

                int rot = r.nextInt(n);

                int[] rotated = new int[n];
                for(int i=0;i<n;i++)
                    rotated[i] = arr[(i+rot)%n];

                int ans1 = findMinElement(rotated);
                int ans2 = bruteMin(rotated);

                if(ans1 != ans2){
                    System.out.println("Failed");
                    return;
                }
            }

            System.out.println("All 10000 tests passed");
        }
}
