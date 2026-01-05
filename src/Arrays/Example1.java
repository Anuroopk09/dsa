package Arrays;

public class Example1 {
    //find element by index
    public static void main(String[] args) {
        int[] arr = new int[]{3, 6, 5, 1, 2, 25, 50};
        int element = 25;

        for(int i = 0; i < arr.length; ++i) {
            if (element == arr[i]) {
                System.out.print(i);
            }
        }
    }
}
