/* 387. First Unique Character in a String
Easy
7.3K
248
Companies
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

 

Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1
*/


class Solution {
public:
    int firstUniqChar(string s) {
        int arr[26]={0};
        int ans = -1;
        for(int i=0; i<s.size(); i++){
            int index = s[i]-'a';
            arr[index]++;
        }
        for(int i=0;i<s.size();i++){
            if(arr[s[i]-'a'] == 1) 
            return i; 
        }
        return ans;
    }
};
