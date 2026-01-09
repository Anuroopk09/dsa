package Arrays;

public class Example14 {
    //three-sum problem
    public static void main(String[] args) {
        int[] arr = {2,7,11,15,-2,4};
        int sum =20;
        for (int i = 0;i<arr.length-2;i++)
        {
            for (int j = i+1;j<arr.length-1;j++)
            {
                for (int k = j+1;k<arr.length;k++)
                {
                    if (arr[i]+arr[j]+arr[k]==sum)
                    {
                        System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                    }
                }
            }
        }
    }
}
