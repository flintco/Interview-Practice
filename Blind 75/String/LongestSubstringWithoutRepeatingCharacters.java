// 3. Longest Substring Without Repeating Characters

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        //Keeps track of duplicates in the substring. Key is the character and it will have a value of 1 if it alread occurs, zero if not.
        HashMap<Character, Integer> hmap = new HashMap<>();
        
        //i is current index, j is start of substring, k is end of substring, distance is max distance so far
        int i = 0;
        int j = 0;
        int k = 0;
        int distance = 0;
        
        while(i < s.length()){
            k = i;
            //Unique letter
            if (hmap.get(s.charAt(i)) == null){
                hmap.put(s.charAt(i),1);
                distance = Math.max(distance, k-j+1);
            } 
            //Duplicate letter
            else {
                //Checks if duplicate letter is before or after current start
                int oldJ = j;
                j=i-1;
                while(s.charAt(j) != s.charAt(i)){
                    j = j-1;
                }
                j = j+1;
                if (oldJ > j){
                    j = oldJ;
                }
                distance = Math.max(distance, k-j+1);
            }
            //System.out.println("i: " + i + ", j: " + j + ", k: " + k + ", distance: " + distance);
            i = i+1;
        }
        return distance;
    }
}


/*
Description: Given a string s, find the length of the longest substring without repeating characters.

Step 1 Brute Force: Find all substrings (continuous) and find the longest one that doesn't have repeating characters. Time complexity 0(n^3)

Step 2  Sliding Window: Keep track of front and back of substring with vars j and k. Go through 
each character chronologically (i) and keep track of max substring up until that point. 
If you encounter a duplicate, move front of substring up until you find duplicate letter. 0(n) time complexity. 

Completed in 1:27:32
*/

/* 
This is better written code I found on LeetCode

class Solution
{
    public int lengthOfLongestSubstring(String s)
	{
        Map<Character, Integer> map = new HashMap<>();		// Store character-index mapping
		int n = s.length(), maxLen = 0;
         
        for(int j = 0, i = 0; j < n; j++)					// Try to extend the range [i, j]
		{
            if(map.containsKey(s.charAt(j)))
			{
                int k = map.get(s.charAt(j));
				i = Math.max(i, k + 1);
            }
			int substringLen = j - i + 1;
            maxLen = Math.max(maxLen, substringLen);
            map.put(s.charAt(j), j);
        }
        return maxLen;
    }
}
*/