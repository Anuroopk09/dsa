package Arrays;
//check if array is sorted
public class Example3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1};
        boolean isSorted = true;

        for (int i=0;i<arr.length-1;i++)
        {
            if (arr[i]>arr[i+1])
            {
                isSorted= false;
            }
        }

        if (isSorted)
        {
            System.out.println("Array is sorted");
        }
        else
        {
            System.out.println("Array is Not sorted");
        }
    }
}
