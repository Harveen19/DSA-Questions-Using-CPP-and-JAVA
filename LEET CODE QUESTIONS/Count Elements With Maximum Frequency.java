// 3005. Count Elements With Maximum Frequency
// Solved
// Easy
// Topics
// Companies
// Hint
// You are given an array nums consisting of positive integers.

// Return the total frequencies of elements in nums such that those elements all have the maximum frequency.

// The frequency of an element is the number of occurrences of that element in the array.

 

// Example 1:

// Input: nums = [1,2,2,3,1,4]
// Output: 4
// Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
// So the number of elements in the array with maximum frequency is 4.
// Example 2:

// Input: nums = [1,2,3,4,5]
// Output: 5
// Explanation: All elements of the array have a frequency of 1 which is the maximum.
// So the number of elements in the array with maximum frequency is 5.
 

// Constraints:

// 1 <= nums.length <= 100
// 1 <= nums[i] <= 100

class Solution {
    public int maxFrequencyElements(int[] nums) {
        // First Approach
        /*HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int max = 0;

        for(int i=0;i<nums.length;i++){
           map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
           max = Math.max(max, map.get(nums[i]));
        }

        for (int freq : map.values()) {
            if (freq == max)    
            count += freq;
        }

        return count;*/

        // Second Approach
        int res = 0;
        int max = Integer.MIN_VALUE;
        int count[] = new int[101];

        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }

        for(int i=0;i<count.length;i++){
            max = Math.max(max, count[i]);
        }

        for(int i=0;i<nums.length;i++){
            if(max == count[nums[i]]){
                res++;
            }
        }

        return res;
    }
}
