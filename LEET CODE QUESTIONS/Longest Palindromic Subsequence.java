/* 516. Longest Palindromic Subsequence
Medium
7.8K
292
Companies
Given a string s, find the longest palindromic subsequence's length in s.

A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.

 

Example 1:

Input: s = "bbbab"
Output: 4
Explanation: One possible longest palindromic subsequence is "bbbb".
Example 2:

Input: s = "cbbd"
Output: 2
Explanation: One possible longest palindromic subsequence is "bb".
*/

class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        for(int i=0;i<n;i++){
            dp[i][i] = 1; // because a single character is always a palindrome
        }

        for(int len = 2; len <= n; len++){
            for(int i=0;i<n-len+1;i++){
                int j = i + len - 1;

                if(s.charAt(i) == s.charAt(j)){
                    // because we can add the two matching characters to the palindromic subsequence.
                    dp[i][j] = dp[i+1][j-1] + 2;
                }
                else{
                    dp[i][j] = Math.max(dp[i+1][j] , dp[i][j-1]);
                }
            }
        }

        return dp[0][n-1];
    }
}

// Time complexity => O(n^2) as we are filling n*n array and each cell takes O(1) time to fill.
