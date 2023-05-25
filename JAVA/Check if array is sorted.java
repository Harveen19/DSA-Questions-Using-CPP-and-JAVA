/* Check if array is sorted
Easy  Accuracy: 39.37%  Submissions: 123K+  Points: 2
Last Week Of Job Fair 2023. Explore Unlimited Opportunities Now!
Given an array arr[] of size N, check if it is sorted in non-decreasing order or not. 

Example 1:

Input:
N = 5
arr[] = {10, 20, 30, 40, 50}
Output: 1
Explanation: The given array is sorted.
Example 2:

Input:
N = 6
arr[] = {90, 80, 100, 70, 40, 30}
Output: 0
Explanation: The given array is not sorted.

Your Task:
You don't need to read input or print anything. Your task is to complete the function arraySortedOrNot() which takes the arr[] and N as input parameters and returns a boolean value (true if it is sorted otherwise false).


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 105
1 ≤ Arr[i] ≤ 10^6
*/


class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        int n1 = 0, n2 = 0;
        for(int i=0; i<n-1; i++){
            if(arr[i] <= arr[i+1]){
                n1 ++;
            }
            else if(arr[i] == arr[i+1]){
                n2 ++;
            }
        }
        
        if(n1 == n-1){
            return true;
        }
        else if(n2 == n-1){
            return true;
        }
        
        return false;
    }
}
