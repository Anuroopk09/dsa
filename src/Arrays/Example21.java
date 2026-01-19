package Arrays;


public class Example21 {

    //linear search
    public static int linearSearch(int[] arr)
    {
        int target = 1;
        for (int i =0;i<arr.length;i++)
        {
            if (arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
    static void main() {
        int[] arr ={3,6,5,1,2};
        System.out.println("Element found at index:"+linearSearch(arr));

        int[] arr2 = {3,6,5,2,4,2,4};
        System.out.println("Element found at index:"+linearSearch(arr2));

    }
}
