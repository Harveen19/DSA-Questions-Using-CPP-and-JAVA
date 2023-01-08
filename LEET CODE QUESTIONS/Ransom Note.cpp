/* 383. Ransom Note
Easy
3.5K
391
Companies
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false
Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false
Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true
*/

class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        if(ransomNote.size()>magazine.size()){
            return false;
        }
        map<char,int> m;
        for(int i=0;i<magazine.size();i++){
            m[magazine[i]]++;
        }
        for(int i=0;i<ransomNote.size();i++){
            if(m[ransomNote[i]]>0){
                m[ransomNote[i]]--;
            }
            else{
                return false;
            }
        }
        return true;
    }
};
