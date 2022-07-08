// 26. Remove Duplicates from Sorted Array

class Solution {
    public int removeDuplicates(int[] nums) {
        int currentSpot = 0;
        int nextOpen = 0;
        int lastValue = Integer.MAX_VALUE;
        
        for(currentSpot = 0; currentSpot<nums.length; currentSpot++){
            if(nums[currentSpot] == lastValue){
                
            } else{
                nums[nextOpen] = nums[currentSpot];
                lastValue = nums[currentSpot];
                nextOpen += 1;
            }
        }
    
        return nextOpen;
            
    }
}