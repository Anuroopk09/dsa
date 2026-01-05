package Arrays;
import java.util.Scanner;

public class Example5 {
    //left shift
    public static void main(String[] args) {
        int[] arr = new int[]{3, 6, 5, 1, 2};
        int[] arr2 = new int[arr.length];
        Scanner sc = new Scanner(System.in);
        int shift = sc.nextInt();
        shift %= arr.length;

        for(int i = shift; i < arr.length; ++i) {
            arr2[i - shift] = arr[i];
        }

        for(int i = 0; i < shift; ++i) {
            arr2[arr2.length - shift + i] = arr[i];
        }

        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println();
    }
}
