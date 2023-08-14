// Non Repeating Numbers
// Medium Accuracy: 36.9% Submissions: 123K+ Points: 4

// Given an array A containing 2*N+2 positive numbers, out of which 2*N numbers exist in pairs whereas the other two number occur exactly once and are distinct. Find the other two numbers. Return in increasing order.

// Example 1:

// Input: 
// N = 2
// arr[] = {1, 2, 3, 2, 1, 4}
// Output:
// 3 4 
// Explanation:
// 3 and 4 occur exactly once.
// Example 2:

// Input:
// N = 1
// arr[] = {2, 1, 3, 2}
// Output:
// 1 3
// Explanation:
// 1 3 occur exactly once.
// Your Task:
// You do not need to read or print anything. Your task is to complete the function singleNumber() which takes the array as input parameter and returns a list of two numbers which occur exactly once in the array. The list must be in ascending order.

// Expected Time Complexity: O(N)
// Expected Space Complexity: O(1)

// Constraints:
// 1 <= length of array <= 10^6 
// 1 <= Elements in array <= 5 * 10^6

class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
        int n = nums.length;
        
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = (sum ^ nums[i]);
        }
        
        sum = (sum &-sum);
        int num1 = 0;
        int num2 = 0;
        
        for(int i=0; i<n; i++){
            if((nums[i] & sum) > 0){
                num1 = (num1 ^ nums[i]);
            }
            else{
                num2 = (num2 ^ nums[i]);
            }
        }
        
        if(num1 > num2){
            return new int[] {num2, num1};
        }
        else{
            return new int[] {num1, num2};
        }
    }
}
