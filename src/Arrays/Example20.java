package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
public class Example20
{
    //sort all the positives and negatives in an array
    static void main()
    {
        int[] arr = {1, 2, -4, -5};
        //arraylist is used here to dynamically increase/decrease the size of
        //array and avoid unnecessary indexing during merging
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i =0;i<arr.length;i++)
        {
            if (arr[i]>0)
            {
                pos.add(arr[i]);
            }
            else
            {
                neg.add(arr[i]);
            }
        }
        neg.addAll(pos);
        System.out.println(neg);
    }
}
