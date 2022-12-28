//34. Find First and Last Position of Element in Sorted Array
//Medium
//15.2K
//363
//Companies
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

//If target is not found in the array, return [-1, -1].

//You must write an algorithm with O(log n) runtime complexity.

//Example 1:

//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
//Example 2:

//Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]
//Example 3:

//Input: nums = [], target = 0
//Output: [-1,-1]

class Solution {
public:
	vector<int> searchRange(vector<int>& nums, int target) {
		vector<int>v;
		int n=nums.size();
		int start=0, end=n-1, start1=0, end1=n-1, first=-1, last=-1;
		while(start<=end){
			int mid=start+(end-start)/2;
			if(target==nums[mid]){
				first=mid;
				end=mid-1;
			}
			if(target>nums[mid]){
				start=mid+1;
			}
			else if(target<nums[mid]){
				end=mid-1;
			}

		}
		if(first==-1){
			v.push_back(-1);
		}
		else{
			v.push_back(first);
		}
		while(start1<=end1){
			int mid=start1+(end1-start1)/2;
			if(target==nums[mid]){
				last=mid;
				start1=mid+1;
			}
			else if(target>nums[mid]){
				start1=mid+1;
			}
			else if(target<nums[mid]){
				end1=mid-1;
			}

		}
		if(last==-1){
			v.push_back(-1);
		}
		else{
			v.push_back(last);
		}
		return v;
	}
};