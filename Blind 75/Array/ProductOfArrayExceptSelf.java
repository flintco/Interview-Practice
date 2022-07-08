// 238. Product of Array Except Self

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int currentProduct = 1;
        
        //Calculate prefix
        int[] prefix = new int[nums.length];
        int prefixLastNum = 1;
        for (int i=0; i<prefix.length; i++){
            prefix[i] = prefixLastNum * nums[i];
            prefixLastNum = prefix[i];
        }
        
        //Calculate postfix
        int[] postfix = new int[nums.length];
        int postfixLastNum = 1;
        for (int j=(nums.length-1); j>=0; j--){
            postfix[j] = postfixLastNum * nums[j];
            postfixLastNum = postfix[j];
        }
        
        //Merge into output array
        for (int k=0; k<nums.length; k++){
            int prefixVal = 0;
            int postfixVal = 0;
            if(k-1 < 0){
                prefixVal = 1;
            } else {
                prefixVal = prefix[k-1];
            }
            if(k+1 >= nums.length){
                postfixVal = 1;
            } else {
                postfixVal = postfix[k+1];
            }
            output[k] = prefixVal * postfixVal;
        }
       
        return output;
        
    }
}
/*
Step 1: Brute Force
For each number in array, multiply the other numbers and add to output array. 0(n^2) time complexity.

Step 2: Greedy:
We need to solve this problem in 0(n) time and can't use division.
First find the prefix array which is the product of current number and values at all previous indexes.
Then find postfix array which is the product of current number and values at all future indexes.
Because we know the product of numbers before and after a given index, we multiply those two numbers into output array.


Problem Link: https://leetcode.com/problems/product-of-array-except-self/submissions/
Good Explanation: https://www.youtube.com/watch?v=bNvIQI2wAjk
*/