// 70. Climbing Stairs

class Solution {
    public int[] memo = new int[46];
    
    public int climbStairs(int n) {
        if (n == 0 || n==1){
            return 1;
        } else if (memo[n] != 0){
             return memo[n];
        } else {
            memo[n] = climbStairs(n-1) + climbStairs(n-2);
            return memo[n];
        }
    }
}

/* 
Description:

Step 1 Brute Force: Recursive algorithm. For each recursive step, call recursive possiblity of two steps or one step. Keep Counter of how many times the recursion is called.

Step 2 Dynamic Programming: To memoize, keep results of past recursive calls in a 1D array. Input of recursive is equivalent to index of memoization array and value is equal to result of recursive call.

Completed in 43:30
*/