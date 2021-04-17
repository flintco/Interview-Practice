/* 
Given an integer array nums, return true if any value appears at least twice in the array, 
and return false if every element is distinct.

1) Brute force method
- Make a second array called AlreadyOccurs. Go through each element in given array
and check if it is in AlreadyOccurs. If it is, return true.

var used = [];
    for (var i = 0; i < nums.length; i++){
        if (used.includes(nums[i])){
            return true;
        }
        used[used.length] = nums[i];
    }
    return false;

2) Run Times
- Time: O(n^2)
- Space: O(n)

3) More efficient method
- Create a sum of past array valules. For each item, do modulo of sum. If == 0, then return true.
Time complexity is now O(n).

var arraySum = nums[0];
    for (var i = 1; i < nums.length; i++){
        if (arraySum % nums[i] == 0){
            return true;
        }
        arraySum += nums[i];
    }
    return false;

Didn't work.

Correct Answers: Sorting, Hashtable

*/

/**
 * @param {number[]} nums
 * @return {boolean}
 */
 var containsDuplicate = function(nums) {
    
};