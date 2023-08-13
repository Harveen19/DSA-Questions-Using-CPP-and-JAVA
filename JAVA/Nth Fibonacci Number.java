// Nth Fibonacci Number
// Easy Accuracy: 22.3% Submissions: 226K+ Points: 2

// Given a positive integer n, find the nth fibonacci number. Since the answer can be very large, return the answer modulo 1000000007.

// Example 1:

// Input: 
// n = 2
// Output: 
// 1 
// Explanation: 
// 1 is the 2nd number of fibonacci series.
// Example 2:

// Input: 
// n = 5
// Output: 
// 5
// Explanation: 
// 5 is the 5th number of fibonacci series.
// Your Task:  
// You dont need to read input or print anything. Complete the function nthFibonacci() which takes n as input parameter and returns nth fibonacci number.

// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(n)

// Constraints:
// 1<= n <=10^5

class Solution {
    static int nthFibonacci(int n){
        // code here
        
        int max = 100005;
        int mod = 1000000007;
        
        int[] term = new int[max];
        term[0] = 0;
        term[1] = 1;
        
        for(int i=2; i<=n; i++){
            term[i] = (term[i - 1] + term[i - 2]) % mod;
        }
        
        return term[n];
    }
}
