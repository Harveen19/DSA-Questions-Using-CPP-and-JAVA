// 451. Sort Characters By Frequency
// Solved
// Medium
// Topics
// Companies
// Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

// Return the sorted string. If there are multiple answers, return any of them.

 

// Example 1:

// Input: s = "tree"
// Output: "eert"
// Explanation: 'e' appears twice while 'r' and 't' both appear once.
// So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
// Example 2:

// Input: s = "cccaaa"
// Output: "aaaccc"
// Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
// Note that "cacaca" is incorrect, as the same characters must be together.
// Example 3:

// Input: s = "Aabb"
// Output: "bbAa"
// Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
// Note that 'A' and 'a' are treated as two different characters.
 

// Constraints:

// 1 <= s.length <= 5 * 10^5
// s consists of uppercase and lowercase English letters and digits.

class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        List<Character>[] arr = new ArrayList[s.length() + 1];
        Map<Character,Integer> mp = new HashMap<>();

        for(char ch: s.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch,0) + 1);
        }
        mp.keySet().forEach(ch -> {
            if(arr[mp.get(ch)] == null){
                arr[mp.get(ch)] = new ArrayList();
            }
            arr[mp.get(ch)].add(ch);
        });

        for(int i=arr.length - 1; i>0; i--){
            if(arr[i] != null){
                for(Character ch : arr[i]){
                    for(int j=0;j<i;j++){
                        sb.append(ch);
                    }
                }
            }
        }
        return sb.toString();
    }
}
