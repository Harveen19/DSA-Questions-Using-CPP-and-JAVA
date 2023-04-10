/* 414. Third Maximum Number
Easy
2.4K
2.8K
Companies
Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

 

Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
Example 2:

Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.
Example 3:

Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1.
*/

class Solution {
    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE; // First maximum
        long max2 = Long.MIN_VALUE; // Second maximum
        long max3 = Long.MIN_VALUE; // Third maximum

        for(int i=0;i<nums.length;i++){
            if(nums[i] > max1){
                max3=max2;
                max2=max1;
                max1=nums[i];
            }
            else if(nums[i] > max2 && nums[i] < max1){
                max3=max2;
                max2=nums[i];
            }
            else if(nums[i] > max3 && nums[i] < max2){
                max3=nums[i];
            }
        }
        return max3 == Long.MIN_VALUE ? (int) max1 : (int) max3;
    }
}
