/* 75. Sort Colors
Medium
14.4K
514
Companies
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
*/

class Solution {
    public void sortColors(int[] nums) {
        int zero = -1;
        int one = -1;
        int two = -1;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                nums[++two] = 2;
                nums[++one] = 1;
                nums[++zero] = 0;
            }
            else if(nums[i] == 1){ 
                nums[++two] = 2;
                nums[++one] = 1;
            }
            else{
                nums[++two] = 2;
            }
        }
    }
}
