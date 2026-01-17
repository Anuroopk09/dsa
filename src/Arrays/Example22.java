package Arrays;

public class Example22
{
    //stock buy and sell
    public static int stockBuySell(int[] prices)
    {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++)
        {
            for (int j = i + 1; j < prices.length; j++)
            {
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args)
    {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + stockBuySell(prices));
    }
}




