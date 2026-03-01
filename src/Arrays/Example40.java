package Arrays;

public class Example40
{
    //first and last occurance in an array
    static int firstOcc(int[] arr,int target)
    {
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
    static int lastOcc(int[] arr,int target)
    {
        int length=arr.length-1;
        for (int i=length;i>=0;i--)
        {
            if (arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
    static void finalAns(int[]arr,int target)
    {
        int[] arr2=new int[2];
        arr2[0]= firstOcc(arr,target);
        arr2[1]=lastOcc(arr,target);
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] arr={3, 4, 13, 13, 13, 20, 40};
        int target = 13;
        finalAns(arr,target);
    }
}
