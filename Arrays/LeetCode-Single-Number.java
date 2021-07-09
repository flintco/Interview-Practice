/* https://leetcode.com/problems/single-number/


Given a non-empty array of integers nums, every element appears twice 
except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use 
only constant extra space.

Lessons Learned:
- XOR is a helpful bitwise operation to compare integers (^ is the symbol to do XOR)
- .length is very useful in determining number of elements in an array
*/

 class Solution {
    public int singleNumber(int[] nums) {
        int answer = 0;
            
        for (int i=0; i < nums.length; i++){
            answer ^= nums[i];
        }
        
        return answer;
    }
}

