// 26. Remove Duplicates from Sorted Array

class Solution {
    public int removeDuplicates(int[] nums) {
        int uniqueNum = 0;
        int lastNum = Integer.MIN_VALUE;
        int nextSpotInArray = 0;
        
        for (int i=0; i<nums.length; i++){
            System.out.print(nums[nums.length-1]+", ");
            if (nums[i] == lastNum){} else {
                uniqueNum += 1;
                lastNum = nums[i];
                nums[nextSpotInArray] = nums[i];
                nextSpotInArray += 1;
            }
        }
        return uniqueNum;
    }
}

/*
Description: Array of Integers in increasing order. Return number of unique numbers and update array so unique values are at beginng. Solution can't involve creating new array.

Step 1 Brute Force: Go number by number, if unique move it up to first open spot

Completed in 39:27

*/