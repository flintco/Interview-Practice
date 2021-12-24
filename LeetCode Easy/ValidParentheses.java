// 20.Valid Parentheses

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        //Go through every letter
        for (int i=0; i < s.length(); i++){
            Character currentChar = s.charAt(i);
            if (currentChar == '('){
                stack.push(')');
            } else if (currentChar == '{'){
                stack.push('}');
            } else if (currentChar == '['){
                stack.push(']');
            } else{
                if (!stack.isEmpty()){
                    Character topOfStack = stack.pop();
                    if (currentChar != topOfStack){
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        
        if (stack.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}


/*
Description: Given bracket characters, determine if input string is valid.

Step 1 Brute Force: Go through each character in string. If it is an opening character , add it to the stack (Last in, first out). If a closing character, make sure there are items in the stack and it matches item at top of stack. 

Completed in 23:19
*/