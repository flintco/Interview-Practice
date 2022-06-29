// 392. Is Subsequence

class Solution {
    public boolean isSubsequence(String s, String t) {
        boolean subsequenceFound = false;
        int subsequenceCounter = 0;
        int mainStringCounter = 0;
        
        if(s.length() == 0){
            return true;
        }
        if(t.length() == 0){
            return false;
        }
        
        for (mainStringCounter = 0; mainStringCounter< t.length(); mainStringCounter++){
            if (t.charAt(mainStringCounter) == s.charAt(subsequenceCounter)){
                subsequenceCounter += 1;
                if(subsequenceCounter >= s.length()){
                    subsequenceFound = true;
                    break;
                }
            }
        }
        
        return subsequenceFound;
    }
}

/*
Description:Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
Ex. "ace" is a subsequence of "abcde" while "aec" is not

Step 1 Brute Force: Find all potential subsequences in 0(n^3) time and see if one matches

Step 2: Use pointer technique with one pointer pointing to smaller string and one pointing to bigger string.
If you get through the entire small string, then you have a subsequence in O(n) time. 
*/