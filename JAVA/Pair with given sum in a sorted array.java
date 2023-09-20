// Pair with given sum in a sorted array
// Easy Accuracy: 26.04% Submissions: 43K+ Points: 2

// You are given an array Arr of size N. You need to find all pairs in the array that sum to a number K. If no such pair exists then output will be -1. The elements of the array are distinct and are in sorted order.
// Note: (a,b) and (b,a) are considered same. Also, an element cannot pair with itself, i.e., (a,a) is invalid.

// Example 1:

// Input:
// n = 7
// arr[] = {1, 2, 3, 4, 5, 6, 7}
// K = 8
// Output:
// 3
// Explanation:
// We find 3 such pairs that
// sum to 8 (1,7) (2,6) (3,5)

// Example 2:

// Input:
// n = 7
// arr[] = {1, 2, 3, 4, 5, 6, 7}
// K = 98 
// Output:
// -1 
 

// Your Task:
// This is a function problem. The input is already taken care of by the driver code. You only need to complete the function Countpair() that takes an array (arr), sizeOfArray (n), an integer K, and return the count of the pairs which add up to the sum K. The driver code takes care of the printing.


// Expected Time Complexity: O(N).
// Expected Auxiliary Space: O(1).

 

// Constraints:
// 0 <= Ai <=10^7
// 2 <= N <= 10^7
// 0 <= K <= 10^7

class Solution{
  
    int Countpair(int a[], int n, int sum)
    {
        // Complete the function
        
        int count = 0;
        int left = 0;
        int right = n-1;
        
        while(left < right){
            int total = a[left] + a[right];
            if(total == sum){
                count ++;
                left ++;
                right --;
            }
            else if(total < sum){
                left ++;
            }
            else{
                right --;
            }
        }
        
        if(count == 0){
            return -1;
        }
        
        return count;
    }
}
