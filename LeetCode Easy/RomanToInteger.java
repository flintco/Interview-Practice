// 13. Roman to Integer

class Solution {
    public int romanToInt(String s) {
        int finalNumber = 0;
        
        //For loop to go through every character
        for (int i=0; i < s.length(); i++){
            //Checks if next number exists and 6 special cases
            if (i+1 < s.length()){
                if (s.charAt(i) == 'I' && s.charAt(i+1) == 'V'){
                    finalNumber -= 1;
                    continue;
                } else if (s.charAt(i) == 'I' && s.charAt(i+1) == 'X'){
                    finalNumber -= 1;
                    continue;
                } else if (s.charAt(i) == 'X' && s.charAt(i+1) == 'L'){
                    finalNumber -= 10;
                    continue;
                } else if (s.charAt(i) == 'X' && s.charAt(i+1) == 'C'){
                    finalNumber -= 10;
                    continue;
                } else if (s.charAt(i) == 'C' && s.charAt(i+1) == 'D'){
                    finalNumber -= 100;
                    continue;
                } else if (s.charAt(i) == 'C' && s.charAt(i+1) == 'M'){
                    finalNumber -= 100;
                    continue;
                }
            }
            
            //Cases for amount
            if (s.charAt(i) == 'I'){
                finalNumber += 1;
            } else if (s.charAt(i) == 'X'){
                finalNumber += 10;
            } else if (s.charAt(i) == 'C'){
                finalNumber += 100;
            } else if (s.charAt(i) == 'V'){
                finalNumber += 5;
            } else if (s.charAt(i) == 'L'){
                finalNumber += 50;
            } else if (s.charAt(i) == 'D'){
                finalNumber += 500;
            } else if (s.charAt(i) == 'M'){
                finalNumber += 1000;
            }
        }
        return finalNumber;
    }
}

/*
Description: Return an integer, given a roman numeral

Step 1 Brute Force: Read string character by character from left to right. Have cases that determine which number to convert to. Sum all numbers and return. 0(n)

Completed in 22:06
*/