package Arrays;

public class Example13 {
    //Two-sum problem
    public static void main(String[] args) {
        int arr[] = {2,3,6,5,8,11};
        int sum = 14;
        for (int i =0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==sum)
                {
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
    }
}
