//53. Maximum Subarray
//Medium
//27.1K
//1.2K
//Companies
//Given an integer array nums, find the subarray which has the largest sum and return its sum.


//Example 1:

//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.
//Example 2:

//Input: nums = [1]
//Output: 1
//Example 3:

//Input: nums = [5,4,-1,7,8]
//Output: 23


class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        if(nums.size()==0){
            return 0;
        }
        int maxSum=nums[0];
        int currSum=nums[0];
        for(int i=1; i<nums.size(); i++){
            currSum= max(nums[i], currSum+nums[i]);
            maxSum= max(maxSum,currSum);
       }
        return maxSum;
    }
};