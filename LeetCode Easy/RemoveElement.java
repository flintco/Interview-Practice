// 27. Remove Element

class Solution {
    public int removeElement(int[] nums, int val) {
        int firstAvailableSlot = 0;
        for (int i=0; i < nums.length; i++){
            if (nums[i] == val){
                //Nothing happens here
            } else {
                nums[firstAvailableSlot] = nums[i];
                firstAvailableSlot += 1;
            }
        }
        return firstAvailableSlot;
    }
}

/*
Description: Given an int array and an integer value remove all occurence of value.
Have beginning of array filled with all remaining numbers. Don't make another array.

Brute Force Step 1: Go through array once to find first value. Then go through the rest of the array to find next value. 0(n^2)

Two Pointer Step 2: Go through each element of nums. If given num it is not "value", put at first available slot. 

Completed in 9:10
*/