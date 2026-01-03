package Arrays;
//second largets element in an array
public class Example2 {
    public static void main(String[] args) {
        int[] arr={3,6,5,1,2,8};
        int max = 0;
        int secondMax = 0;

        for(int i =0;i<arr.length;i++)
        {
            if (arr[i]>max)
            {
                secondMax = max;
                max = arr[i];
            }
            else if (secondMax<arr[i]&&max>arr[i])
            {
                secondMax=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(secondMax);
    }

}
