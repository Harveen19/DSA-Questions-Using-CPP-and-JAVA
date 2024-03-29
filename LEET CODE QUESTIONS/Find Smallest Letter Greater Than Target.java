/* 744. Find Smallest Letter Greater Than Target
Easy
3.6K
2.1K
Companies
You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

 

Example 1:

Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
Example 2:

Input: letters = ["c","f","j"], target = "c"
Output: "f"
Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
Example 3:

Input: letters = ["x","x","y","y"], target = "z"
Output: "x"
Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
*/

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
      
      // using binary search
        int left = 0;
        int right = letters.length - 1;

        while(left <= right){
            int mid = (left+right) / 2;

            if(letters[mid] <= target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        if(left < letters.length){
            return letters[left];
        }

        else{
            return letters[0];
        }
    }
}
