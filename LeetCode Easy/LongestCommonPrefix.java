// 14. Longest Common Prefix

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longestCommonPrefix = "";
        int lcpLength = strs[0].length();
        
        //Go through each item (except first), comparing to last
        for (int i=1; i < strs.length; i++){
            //Find length of common prefix
            int localLength = 0;
            
            int comparisonMinimum = 0;
            if (strs[i].length() < strs[i-1].length()){
                comparisonMinimum = strs[i].length();
            } else {
                comparisonMinimum = strs[i-1].length();
            }
            
            for (int k=0; k < comparisonMinimum; k++){
                if (strs[i].charAt(k) == strs[i-1].charAt(k)){
                    localLength += 1;
                } else {
                    break;
                }
            }
            
            //See if LCP needs to be smaller
            if (localLength < lcpLength){
                lcpLength = localLength;
                localLength = 0;
            }
            
        }
        //Create longestCommonPrefix
        for (int j=0; j < lcpLength; j++){
            longestCommonPrefix += strs[0].charAt(j);
        }
        return longestCommonPrefix;
    }
}

/*
Description: Find longest common prefix amongst an array of strings

Step 1 Brute Force: Compare each letter of each word in array to see longest common prefix 0(n) time

Step 2 Greedy: Compare each String to the String before it. If their shared prefix is smaller than previous longest, then decrease longestCommonPrefix.

Completed in 14:37
*/