package Arrays;

class Example16 {
    //sort an array of 0's 1's and 2's

    void main() {

        int[] arr = {1, 0, 2, 1, 0};
        int[] arr2 = new int[arr.length];

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        // count 0s, 1s, 2s
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else if (arr[i] == 2) {
                count2++;
            }
        }

        int index = 0;

        // fill 0s
        for (int i = 0; i < count0; i++) {
            arr2[index++] = 0;
        }

        // fill 1s
        for (int i = 0; i < count1; i++) {
            arr2[index++] = 1;
        }

        // fill 2s
        for (int i = 0; i < count2; i++) {
            arr2[index++] = 2;
        }

        // print
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}