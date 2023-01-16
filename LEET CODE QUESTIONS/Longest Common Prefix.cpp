/* 14. Longest Common Prefix
Easy
12.2K
3.7K
Companies
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/

class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string s=strs[0];
        for(int i=1;i<strs.size();i++){
            int k=0, j=0;
            while(k<s.size() || j<strs[i].size()){
                if(s[k]==strs[i][j]){
                    j++;
                    k++;
                }
                else{
                    s=strs[i].substr(0,j);
                    break;
                }
            }
        }
        return s;
    }
};
