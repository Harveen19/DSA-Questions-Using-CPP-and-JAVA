/*Second Largest
School  Accuracy: 26.72%  Submissions: 298K+  Points: 0
Last Week Of Job Fair 2023. Explore Unlimited Opportunities Now!
Given an array Arr of size N, print second largest distinct element from an array.

Example 1:

Input: 
N = 6
Arr[] = {12, 35, 1, 10, 34, 1}
Output: 34
Explanation: The largest element of the 
array is 35 and the second largest element
is 34.
Example 2:

Input: 
N = 3
Arr[] = {10, 5, 10}
Output: 5
Explanation: The largest element of 
the array is 10 and the second 
largest element is 5.
Your Task:
You don't need to read input or print anything. Your task is to complete the function print2largest() which takes the array of integers arr and n as parameters and returns an integer denoting the answer. If 2nd largest element doesn't exist then return -1.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
2 ≤ N ≤ 10^5
1 ≤ Arri ≤ 10^5
*/


class Solution {
    int print2largest(int arr[], int n) {
        // code here
        
        int second_largest=0;
        if(n<2){
            return -1;
        }
        
        Arrays.sort(arr);
        
        // traverse through array from second last index to first index
        for(int i=n-2; i>=0; i--){
            if(arr[i] != arr[n-1]){
                second_largest = arr[i];
                break;
            }
            else{
                // if all values are same output the negative value
                second_largest = -1;
            }
        }
        
        return second_largest;
    }
}
