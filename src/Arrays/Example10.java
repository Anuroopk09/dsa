package Arrays;

public class Example10 {
    //common elements between two arrays
    public static void main(String[] args) {
        int[] arr1 = new int[]{3, 6, 5, 1, 2, 4};
        int[] arr2 = new int[]{6, 4, 5, 9, 0, 7};
        int count = 0;

        for(int i = 0; i < arr1.length; ++i) {
            for(int j = 0; j < arr2.length; ++j) {
                if (arr1[i] == arr2[j]) {
                    ++count;
                    break;
                }
            }
        }

        int[] arr3 = new int[count];
        count = 0;

        for(int i = 0; i < arr1.length; ++i) {
            for(int j = 0; j < arr2.length; ++j) {
                if (arr1[i] == arr2[j]) {
                    arr3[count++] = arr1[i];
                    break;
                }
            }
        }

        for(int i = 0; i < arr3.length; ++i) {
            System.out.print(arr3[i] + " ");
        }

        System.out.println();
    }
}
