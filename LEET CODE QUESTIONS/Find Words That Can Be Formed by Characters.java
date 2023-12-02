// 1160. Find Words That Can Be Formed by Characters
// Solved
// Easy
// Topics
// Companies
// Hint
// You are given an array of strings words and a string chars.

// A string is good if it can be formed by characters from chars (each character can only be used once).

// Return the sum of lengths of all good strings in words.

 

// Example 1:

// Input: words = ["cat","bt","hat","tree"], chars = "atach"
// Output: 6
// Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
// Example 2:

// Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
// Output: 10
// Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
 

// Constraints:

// 1 <= words.length <= 1000
// 1 <= words[i].length, chars.length <= 100
// words[i] and chars consist of lowercase English letters.


class Solution {
    public int countCharacters(String[] words, String chars) {
        // To store frequency of each character
        int[] charCount = new int[26];
        int result = 0;

        // count frequency of each character in char string
        for(char ch : chars.toCharArray()){
            int index = ch - 'a';
            charCount[index]++;
        }

        // check each word if it can be formed using the characters in chars string
        for(String word : words){
            int[] wordCount = new int[26];
            boolean good = true;

            // count the frequency of each character in the word string
            for(char ch : word.toCharArray()){
                int index2 = ch - 'a';
                wordCount[index2]++;
            }

            // Check if the word can be formed using the characters in chars string
            for(int i=0; i<26; i++){
                if(wordCount[i] > charCount[i]){
                    good = false;
                    break;
                }
            }

            if(good){
                result += word.length();
            }
        }

        return result;
    }
}
