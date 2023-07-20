// Non Repeating Character
// Easy  Accuracy: 40.43%  Submissions: 166K+  Points: 2

// Given a string S consisting of lowercase Latin Letters. Return the first non-repeating character in S. If there is no non-repeating character, return '$'.

// Example 1:

// Input:
// S = hello
// Output: h
// Explanation: In the given string, the
// first character which is non-repeating
// is h, as it appears first and there is
// no other 'h' in the string.
// Example 2:

// Input:
// S = zxvczbtxyzvy
// Output: c
// Explanation: In the given string, 'c' is
// the character which is non-repeating. 
// Your Task:
// You only need to complete the function nonrepeatingCharacter() that takes string S as a parameter and returns the character. If there is no non-repeating character then return '$' .

// Expected Time Complexity: O(N).
// Expected Auxiliary Space: O(Number of distinct characters).
// Note: N = |S|

// Constraints:
// 1 <= N <= 10^5


class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        int n = S.length();
        
        Queue<Character> q = new LinkedList<>();
        int freq[] = new int[26];
        
        for(int i=0; i<n; i++){
            char ch = S.charAt(i);
            q.add(ch);
            freq[ch - 'a'] ++;
        }
        
        while(!q.isEmpty()){
            if(freq[q.peek() - 'a'] == 1){
                return q.peek();
            }
            
            q.remove();
        }
        
        return '$';
    }
}
