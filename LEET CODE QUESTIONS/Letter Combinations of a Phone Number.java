/* 17. Letter Combinations of a Phone Number
Medium
14.7K
833
Companies
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.


 

Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:

Input: digits = ""
Output: []
Example 3:

Input: digits = "2"
Output: ["a","b","c"]
*/


class Solution {
    private static String[] LETTERS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits == null || digits.isEmpty()){ // base case
            return res;
        }

        keypadCombinations(digits, 0, "", res);
        return res;
    }

    private void keypadCombinations(String digits, int index, String current, List<String> res){
        if(index == digits.length()){
            res.add(current);
            return;
        }

        int digit = digits.charAt(index) - '0';
        String letters = LETTERS[digit];
        for(int i=0; i<letters.length(); i++){
            char letter = letters.charAt(i);
            keypadCombinations(digits, index+1, current + letter, res);
        }
    }
}
