//20. Valid Parentheses
//Easy
//17.3K
//931
//Companies
//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

//An input string is valid if:

//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
 
//Example 1:

//Input: s = "()"
//Output: true
//Example 2:

//Input: s = "()[]{}"
//Output: true
//Example 3:

//Input: s = "(]"
//Output: false


class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch == '(')
			    stack.push(')');
            else if (ch == '{')
			    stack.push('}');
            else if (ch == '[')
		      	stack.push(']');
            else if (stack.isEmpty() || stack.pop() != ch)
			    return false;
        }
        return stack.isEmpty();
    }
}