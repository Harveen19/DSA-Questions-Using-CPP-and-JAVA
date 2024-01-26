// 5. Longest Palindromic Substring
// Solved
// Medium
// Topics
// Companies
// Hint

// Given a string s, return the longest 
// palindromic substring in s.

// Example 1:

// Input: s = "babad"
// Output: "bab"
// Explanation: "aba" is also a valid answer.
// Example 2:

// Input: s = "cbbd"
// Output: "bb"
 

// Constraints:

// 1 <= s.length <= 1000
// s consist of only digits and English letters.

class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1){
            return s;
        }

        String result = "";
        for(int i=1;i<s.length();i++){
            // Odd Length
            int low = i, high = i;
            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;

                if(low == -1 || high == s.length()){
                    break;
                }
            }

            String palindrome = s.substring(low+1,high);
            if(palindrome.length() > result.length()){
                result = palindrome;
            }

            // Even Length
            low = i - 1;
            high = i;
            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;

                if(low == -1 || high == s.length()){
                    break;
                }
            }

            palindrome = s.substring(low+1,high);
            if(palindrome.length() > result.length()){
                result = palindrome;
            }
        }

        return result;
    }
}
