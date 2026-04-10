package Recursion;

import java.util.Arrays;
public class Example1 {
    static int climbUtil(int n, int[] dp)
    {
        if (n == 0 || n == 1)
        {
            return 1;
        }

        if (dp[n] != -1)
        {
            return dp[n];
        }

        dp[n] = climbUtil(n - 1, dp) + climbUtil(n - 2, dp);
        return dp[n];
    }

    static int climbStairs(int n)
    {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return climbUtil(n, dp);
    }

    public static void main(String[] args)
    {
        int n = 5;
        System.out.println(climbStairs(n));
    }
}
