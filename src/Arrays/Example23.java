package Arrays;

public class Example23
{
    //check which element appears once and which twice
    public static int appear(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            int num = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) {
                    count++;
                }
            }
            if (count == 1) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={4,2,1,1,2};
        System.out.println(appear(arr));
    }
}
