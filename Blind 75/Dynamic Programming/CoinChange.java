// 322. Coin Change

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] memoArray = new int[amount+1];
         Arrays.fill(memoArray, Integer.MAX_VALUE);
        
        memoArray[0] = 0;
        
        for (int i=1; i<memoArray.length; i++){
            int currentMin = Integer.MAX_VALUE;
            //After subtracting coin, which has least coins used
            for(int j=0; j<coins.length; j++){
                if(i-coins[j] >= 0){
                    if(memoArray[i-coins[j]] != -1){
                        currentMin = Math.min(currentMin, memoArray[i-coins[j]]);
                    }
                }
            }
            if (currentMin == Integer.MAX_VALUE){
                memoArray[i] = -1;
            } else {
                memoArray[i] = currentMin+1;
            }
        }
        

        return memoArray[amount];
    }
}

/* 
Description:

Step 1 Brute Force: All Combinations of coins that add up to target amount. 0(n^k).

Step 2 Dynamic Programming: To memoize, we have a 1D array that represents the fewest number of coins need to make x cents.
The array will be of size amount + 1. We will iterate through the memoization array and to find the fewest number of coins
for a given amount. At each iteration, we will loop through coins and find mininimum of memo[amount-coin].

Problem Link: https://leetcode.com/problems/coin-change/
Good explanation: https://www.youtube.com/watch?v=1R0_7HqNaW0
*/