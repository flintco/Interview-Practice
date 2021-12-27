// 136. Single Number

 class Solution {
    public int singleNumber(int[] nums) {
        int answer = 0;
            
        for (int i=0; i < nums.length; i++){
            answer ^= nums[i];
        }
        
        return answer;
    }
}

/*
Description: Given an array of integers, all numbers occur twice except for 1. Find the single number
in 0(n) time and 0(n) space complexity.

Step 1: Use XOR the bitwise operation to compare integers.
*/