/* Maximum Product Subarray
Medium  Accuracy: 18.09%  Submissions: 282K+  Points: 4
Last Week Of Job Fair 2023. Explore Unlimited Opportunities Now!
Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.

Example 1:

Input:
N = 5
Arr[] = {6, -3, -10, 0, 2}
Output: 180
Explanation: Subarray with maximum product
is [6, -3, -10] which gives product as 180.
Example 2:

Input:
N = 6
Arr[] = {2, 3, 4, 5, -1, 0}
Output: 120
Explanation: Subarray with maximum product
is [2, 3, 4, 5] which gives product as 120.
Your Task:
You don't need to read input or print anything. Your task is to complete the function maxProduct() which takes the array of integers arr and n as parameters and returns an integer denoting the answer.
Note: Use 64-bit integer data type to avoid overflow.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 500
-102 ≤ Arri ≤ 10^2
*/


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long result = Integer.MIN_VALUE;
        long prod = 1;
        
        // traverse from left to right
        for(int i=0; i<n; i++){
            prod *= arr[i];
            result = Math.max(result, prod);
            
            if(arr[i] == 0){
                prod = 1;
            }
        }
        
        prod = 1;
        
        // traverse from right to left 
        for(int i=n-1; i>=0; i--){
            prod *= arr[i];
            result = Math.max(result, prod);
            
            if(arr[i] == 0){
                prod = 1;
            }
        }
        
        return result;
        
    }
}
