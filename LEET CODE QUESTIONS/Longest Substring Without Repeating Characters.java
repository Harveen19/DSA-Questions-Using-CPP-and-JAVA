// 3. Longest Substring Without Repeating Characters
// Solved
// Medium
// Topics
// Companies
// Given a string s, find the length of the longest 
// substring
//  without repeating characters.

 

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

// Constraints:

// 0 <= s.length <= 5 * 104
// s consists of English letters, digits, symbols and spaces.

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0, left = 0, right = 0;
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();

        for(; right < arr.length; right++){
            int index = map.getOrDefault(arr[right], -1);
            if(index != -1 && index >= left){
                result = Math.max(result, right - 1 - left +1);
                left = index + 1;
            }
            map.put(arr[right], right);
        }

        return Math.max(result, right - 1 - left +1);
    }
}
