// 1. Two Sum

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        
        for (int i =0; i < nums.length; i++){
            Integer keyValue = hmap.get(target - nums[i]);
            if (keyValue != null){
                solution[0] = i;
                solution[1] = keyValue;
            } else{
                hmap.put(nums[i],i);
            }
        }
        return solution;
    }
}

/* 
Step 1: Brute Force
Go through every number and for each number see if a number another number sums to target. 0(n^2) time complexity

    int[] solution = new int[2];
    for (int i =0; i < nums.length; i++){
        for (int j =0; j < nums.length; j++)
            if (i == j){
                continue;
            } else {
            if (nums[i] + nums[j] == target){
                solution[0] = i;
                solution[1] = j;
                return solution;
            }
        }
    }
        return solution;

Step 2: Any Preprocessing
Sorting could help here, but in this case I don't think it does

Step 3: Greedy
For each step, check if the compliment has been seen. If not, then add current step to hash table. This will be 0(n) time.

Key Will be Value of Compliment
Value Will be Index of Compliment (NULL if compliment hasn't been found yet)

*/