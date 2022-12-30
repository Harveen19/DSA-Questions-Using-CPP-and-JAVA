//169. Majority Element
//Easy
//13.2K
//421
//Companies
//Given an array nums of size n, return the majority element.

//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

//Example 1:

//Input: nums = [3,2,3]
//Output: 3
//Example 2:

//Input: nums = [2,2,1,1,1,2,2]
//Output: 2

class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int n= nums.size();
        unordered_map<int,int> m;
        for(auto a:nums){
            m[a]++;
            if(m[a]>n/2){
                return a;
            }
        }
        return -1;
    }
};