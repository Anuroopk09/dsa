package Arrays;
//largest element in an array
public class Example0 {
    public static void main(String[] args) {
        int[] arr= {3,6,5,1,2,8};
        int max = Integer.MIN_VALUE;

        for (int i =0;i<arr.length;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);

    }
}
