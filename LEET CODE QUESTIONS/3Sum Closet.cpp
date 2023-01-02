// 16. 3Sum Closest
//Medium
//8.4K
//462
//Companies
//Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

//Return the sum of the three integers.

//You may assume that each input would have exactly one solution.

//Example 1:

//Input: nums = [-1,2,1,-4], target = 1
//Output: 2
//Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

//Example 2:

//Input: nums = [0,0,0], target = 1
//Output: 0
//Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).


class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        sort(nums.begin(), nums.end());
        int n=nums.size();

        int ans;
        int res=INT_MAX;
        for(int i=0;i<n;i++){
            int st=i+1, e=n-1;
            while(st<e){
                int sum=nums[i]+nums[st]+nums[e];
                if(sum==target){
                    return sum;
                }
                if(sum>target){
                    e--;
                }
                else{
                    st++;
                }
                res= nums[0]+nums[1]+nums[n-1];
                if(abs(sum-target)<abs(ans-target)){
                    ans=sum;
                }
            }
        }
        return ans;
    }
};