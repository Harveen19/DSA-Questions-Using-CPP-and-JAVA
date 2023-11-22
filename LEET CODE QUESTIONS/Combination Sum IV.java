// Given an array of distinct integers nums and a target integer target, return the number of possible combinations that add up to target.

// The test cases are generated so that the answer can fit in a 32-bit integer.

 

// Example 1:

// Input: nums = [1,2,3], target = 4
// Output: 7
// Explanation:
// The possible combination ways are:
// (1, 1, 1, 1)
// (1, 1, 2)
// (1, 2, 1)
// (1, 3)
// (2, 1, 1)
// (2, 2)
// (3, 1)
// Note that different sequences are counted as different combinations.
// Example 2:

// Input: nums = [9], target = 3
// Output: 0
 

// Constraints:

// 1 <= nums.length <= 200
// 1 <= nums[i] <= 1000
// All the elements of nums are unique.
// 1 <= target <= 1000
 

class Solution {
    // Method 1 Using DP

    //public int combinationSum4(int[] nums, int target) {
        // This will store number of possible combinations
        //int[] array = new int[target + 1]; 
        //array[0] = 1;

        //for(int i=1;i<=target;i++){
            //for(int j=0;j<nums.length;j++){
                //if(nums[j] <= i){
                    // Means we will add number of possible combinations 
                    //array[i] += array[i - nums[j]];
                //}
            //}
        //}

        //return array[target];
    //}

    // Method 2 Using ArrayList
    
    public static int combinationSum4(int[] nums, int target){
        ArrayList<Integer> array= new ArrayList<>();
        array.add(1);

        for(int i=1;i<=target;i++){
            int sum = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[j] <= i){
                    sum += array.get(i - nums[j]);
                }
            }

            array.add(sum);
        }

        return array.get(target);
    }
}
