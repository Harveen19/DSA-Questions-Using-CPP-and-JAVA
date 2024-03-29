// 78. Subsets
//Medium
//13.1K
//185
//Companies
//Given an integer array nums of unique elements, return all possible subsets (the power set).

//The solution set must not contain duplicate subsets. Return the solution in any order.

//Example 1:

//Input: nums = [1,2,3]
//Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

//Example 2:

//Input: nums = [0]
//Output: [[],[0]]

class Solution {
public:
    vector<vector<int>> subsets(vector<int>& nums) {
        int n=nums.size();
        
        vector<vector<int>> subs(1<<n);
        for(int i=0; i< (1 << n); i++){
            for(int j=0;j<n;j++){
                if(i & (1 << j)){
                    subs[i].push_back(nums[j]);
                }
            }
        }
        return subs;
    }
};