/* 20. Valid Parentheses
Easy
18.2K
1K
Companies
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
*/

class Solution {
public:
    bool isValid(string s) {
        stack<char> stack;
        for(int i=0; i< s.length() ; i++){
            if(!stack.empty()){
                if(stack.top()=='(' && s[i]==')' || stack.top()=='[' && s[i]==']' || stack.top()=='{' && s[i]=='}'){
                    stack.pop();
                    continue;
               }
            }
            stack.push(s[i]);
        } 
        if(stack.empty()){
            return true;
        }
        return false;
    }
};
