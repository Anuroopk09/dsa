package Arrays;

public class Example72
{
    static int[] findThePrefixCommonArray(int[] A, int[] B)
    {
        int n = A.length;
        int[] C = new int[n];
        boolean[] seenA = new boolean[n + 1];
        boolean[] seenB = new boolean[n + 1];
        int common = 0;

        for (int i = 0; i < n; i++)
        {
            seenA[A[i]] = true;
            if (seenB[A[i]]) common++;
            seenB[B[i]] = true;
            if (seenA[B[i]]) common++;
            C[i] = common;
        }
        return C;
    }
    static void printArray(int[] C)
    {
        for (int i =0;i<C.length;i++)
        {
            System.out.print(C[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int[] A = {1,3,2,4};
        int[] B = {3,1,2,4};
        int[] C = findThePrefixCommonArray(A,B);
        printArray(C);


    }
}
