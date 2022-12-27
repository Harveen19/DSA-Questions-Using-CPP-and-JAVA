class Solution {
public:
    int search(vector<int>& nums, int target) {
        int s=0, e=nums.size()-1;
        while(s<=e){
            int mid= (s+e)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if (nums[mid] > target){
                if (nums[mid] > nums[e] && nums[s] > target){
                    s=mid+1;
                } 
                else {
                    e=mid-1;
                }
            }
            else {
                if (nums[mid] < nums[s] && nums[s] <= target) {
                    e=mid-1;
                } 
                else {
                    s=mid+1;
                }
            }
        }
        return -1;
    }
};
