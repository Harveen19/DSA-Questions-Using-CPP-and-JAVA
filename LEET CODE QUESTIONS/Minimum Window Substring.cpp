// 76. Minimum Window Substring
//Hard
//13.9K
//606
//Companies
//Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

//The testcases will be generated such that the answer is unique.

//Example 1:

//Input: s = "ADOBECODEBANC", t = "ABC"
//Output: "BANC"
//Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.

//Example 2:

//Input: s = "a", t = "a"
//Output: "a"
//Explanation: The entire string s is the minimum window.

//Example 3:

//Input: s = "a", t = "aa"
//Output: ""
//Explanation: Both 'a's from t must be included in the window.
//Since the largest window of s only has one 'a', return empty string.
 

class Solution {
public:
    string minWindow(string s, string t) {
        int m[256] = { 0 };
 
    // Answer
    int ans = INT_MAX; // length of ans
    int start = 0; // starting index of ans
    int count = 0;
   
    // creating map
    for (int i = 0; i < t.length(); i++) {
        if (m[t[i]] == 0)
            count++;
        m[t[i]]++;
    }
 
    // References of Window
    int i = 0;
    int j = 0;
 
    // Traversing the window
    while (j < s.length()) {
        // Calculations
        m[s[j]]--;
        if (m[s[j]] == 0)
            count--;
 
        // Condition matching
        if (count == 0) {
            while (count == 0) {
                // Sorting ans
                if (ans > j - i + 1) {
                    ans = min(ans, j - i + 1);
                    start = i;
                }
                // Sliding I
                // Calculation for removing I
 
                m[s[i]]++;
                if (m[s[i]] > 0)
                    count++;
 
                i++;
            }
        }
        j++;
    }
 
    if (ans != INT_MAX)
        return s.substr(start, ans);
    else
        return "";
    }
    
};