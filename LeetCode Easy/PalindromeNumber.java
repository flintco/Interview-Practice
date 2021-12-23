// 9. Palindrome Number

class Solution {
    public boolean isPalindrome(int x) {
        String old = String.valueOf(x);
        String newString = "";
        //Returns false if negative
        if (x < 0){
            return false;
        }
        //Create reversed string
        for (int i = old.length() - 1; i >= 0; i--){
            newString = newString + old.charAt(i);
        }
        //Compare old and new string
        for (int j =0; j < old.length(); j++){
            if (old.charAt(j) != newString.charAt(j)){
                return false;
            }
        }
        return true;
    }
}

/*
Step 1: Brute Force
Convert int to string. Create a new string that is original string reversed. Compare new string to old string at every character. 0(n)
*/

