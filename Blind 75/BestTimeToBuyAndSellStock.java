// 121. Best Time to Buy and Sell Stock

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currentLowest = Integer.MAX_VALUE;
        
        for (int i=0; i<prices.length; i++){
            currentLowest = Math.min(currentLowest, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i]-currentLowest);
        }
        return maxProfit;
    }
}

/*
Descritpion: Given an array that is a price of a stock on a given day, maximize the profit by choosing a single day to buy stock and single day to sell stock.

Step 1 Brute Force: Find any two pairs of days and calculate the profit. Choose pair of days that has most profit. 0(n^2)

Step 2 Greedy: Keep track of the lowest point which is either current price or previous lowest. The max profit at each step is max profit from previous step or current price - current lowest point, whichever is greater. After going through every item in array, we will have maximum price at last item.

Completed in 50:04
*/