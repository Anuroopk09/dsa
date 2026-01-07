package Arrays;

public class Example9
{
    //frequency counter of an array
    public static void main(String[] args) {
        int[] arr={2,2,3,3,1,2,2};
        int size=arr[0];

        for (int i =0;i<arr.length;i++)
        {
            if (arr[i]>size)
            {
                size = arr[i];
            }
        }

        //creating a new hash-array to store the count (occurences of each element)
        int H[] = new int[size+1];
        for (int i =0;i<arr.length;i++)
        {
            H[arr[i]]++;
        }

        //now printing the max element from the new array
        int max= 0;
        for (int i = 0;i<H.length;i++)
        {
            if (H[i]>max)
            {
                max = i;
            }
        }
        System.out.println(max);
    }
}