// 349. Intersection of Two Arrays
// Solved
// Easy
// Topics
// Companies
// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.
 

// Constraints:

// 1 <= nums1.length, nums2.length <= 1000
// 0 <= nums1[i], nums2[i] <= 1000

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Brute Force Approach
        /*ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    if(!res.contains(nums1[i])){
                        res.add(nums1[i]);
                    }
                    break;
                }
            }
        }

        int[] resultArray = new int[res.size()];
        for(int i = 0; i < res.size(); i++) {
            resultArray[i] = res.get(i);
        }

        return resultArray; */

        // Two Pointer Approach
        /*ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0, j=0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                if(!res.contains(nums1[i]))
                res.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            } else {
                j++;
            }
        }

        int[] resultArray = new int[res.size()];
        for(int x = 0; x < res.size(); x++) {
            resultArray[x] = res.get(x);
        }

        return resultArray; */

        // Hash Table
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }

        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
                res.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }

        int[] resultArray = new int[res.size()];
        for(int x = 0; x < res.size(); x++) {
            resultArray[x] = res.get(x);
        }

        return resultArray;
    }
}
