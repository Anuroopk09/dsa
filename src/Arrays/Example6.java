package Arrays;

public class Example6 {
    //shift all zeros towards the end
    public static void main(String[] args) {
        int[] arr = new int[]{3, 6, 0, 1, 0, 5, 0, 3};
        int[] arr2 = new int[arr.length];
        int count = 0;

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] != 0) {
                arr2[count++] = arr[i];
            }
        }

        for(int j = 0; j < arr2.length; ++j) {
            System.out.print(arr2[j] + " ");
        }

        System.out.println();
    }

}
