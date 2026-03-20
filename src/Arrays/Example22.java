package Arrays;

public class Example22
{
    //stock buy and sell
    public static int stockBuySell(int[] prices)
    {
        int n=prices.length;
        int maxProfit=0;
        int bestBuy=prices[0];
        for(int i=0;i<n;i++){
            if(prices[i]>bestBuy){
                maxProfit=Math.max(maxProfit, prices[i]-bestBuy);
            }
            bestBuy=Math.min(bestBuy,prices[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args)
    {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + stockBuySell(prices));
    }
}




