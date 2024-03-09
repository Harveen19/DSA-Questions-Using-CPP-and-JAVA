// 2540. Minimum Common Value
// Solved
// Easy
// Topics
// Companies
// Hint
// Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.

// Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.

 

// Example 1:

// Input: nums1 = [1,2,3], nums2 = [2,4]
// Output: 2
// Explanation: The smallest element common to both arrays is 2, so we return 2.
// Example 2:

// Input: nums1 = [1,2,3,6], nums2 = [2,3,4,5]
// Output: 2
// Explanation: There are two common elements in the array 2 and 3 out of which 2 is the smallest, so 2 is returned.
 

// Constraints:

// 1 <= nums1.length, nums2.length <= 105
// 1 <= nums1[i], nums2[j] <= 109
// Both nums1 and nums2 are sorted in non-decreasing order.


class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        // Approach 1
        /*int common = Integer.MAX_VALUE;
        int i = 0, j = 0;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                common = nums1[i];
                break;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }

        if(common != Integer.MAX_VALUE){
            return common;
        }
        return -1; */

        // Approach 2
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }

        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                min = Math.min(min, nums2[i]);
            }
        }
        
        if(min != Integer.MAX_VALUE){
            return min;
        }
        return -1;

    }
}
