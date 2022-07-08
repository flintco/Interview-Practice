// 217. Contains Duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length; i++){
            if (hmap.get(nums[i]) == null || hmap.get(nums[i]) != 1){
                hmap.put(nums[i], 1);
            } else {
                return true;
            }
        }
        return false;
    }
}

/*
Description: Given an integer arary, return true if any value appears at least twice in array.

Step 1 Brute Force: Create array of already visited nums. Go through nums and check if current num is in visited nums. 0(n)

Step 2: Create hashmap to keep track of visited nums. Key, Value = num, vistited (1) or not (2).

Completed in 5:30
*/