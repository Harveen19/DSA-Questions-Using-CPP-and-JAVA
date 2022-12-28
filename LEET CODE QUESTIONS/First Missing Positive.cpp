//41. First Missing Positive
//Hard
//12.7K
//1.5K
//Companies
//Given an unsorted integer array nums, return the smallest missing positive integer.

//You must implement an algorithm that runs in O(n) time and uses constant extra space.

//Example 1:

//Input: nums = [1,2,0]
//Output: 3
//Explanation: The numbers in the range [1,2] are all in the array.
//Example 2:

//Input: nums = [3,4,-1,1]
//Output: 2
//Explanation: 1 is in the array but 2 is missing.
//Example 3:

//Input: nums = [7,8,9,11,12]
//Output: 1
//Explanation: The smallest positive integer 1 is missing.

class Solution {
public:
    int firstMissingPositive(vector<int>& A) {
        int n = A.size();
        for(int i=0; i<n; i++){
            if(A[i] < 0){
                A[i] = 0;
            }
        }

        for(int i=0; i<n; i++){
            int val = abs(A[i]);

            if(val >= 1 && val <= n){
                if(A[val-1] > 0){
                    A[val-1] *= -1;
                }else if( A[val - 1] == 0 ){
                    A[val - 1] = (n + 1)*-1;
                }
            }
        }

        for(int i=1; i<= n; i++){
            if(A[i-1] >= 0){
                return i;
            }
        }

        return n + 1;
    }
};