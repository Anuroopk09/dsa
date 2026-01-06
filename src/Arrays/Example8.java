package Arrays;

public class Example8 {
    //missing element in an array
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        int n = 5;
        int sum = n*(n+1)/2;
        int arraySum = 0;

        for (int i =0;i<arr.length;i++)
        {
            arraySum+=arr[i];
        }
        int missingElement = sum-arraySum;
        System.out.println(missingElement);
    }
}
