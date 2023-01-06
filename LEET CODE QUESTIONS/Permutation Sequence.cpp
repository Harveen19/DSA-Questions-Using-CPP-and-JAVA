/* 60. Permutation Sequence
Hard
5.2K
427
Companies
The set [1, 2, 3, ..., n] contains a total of n! unique permutations.

By listing and labeling all of the permutations in order, we get the following sequence for n = 3:

"123"
"132"
"213"
"231"
"312"
"321"
Given n and k, return the kth permutation sequence.

 

Example 1:

Input: n = 3, k = 3
Output: "213"
Example 2:

Input: n = 4, k = 9
Output: "2314"
Example 3:

Input: n = 3, k = 1
Output: "123"
*/

class Solution {
public:
    string getPermutation(int n, int k) {
        string ans="";
        vector<int> nums(n);
        iota(nums.begin(),nums.end(),1);
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        k--; 
        for(int i=0;i<n;i++){
            fact=fact/(n-i);
            int id=k/fact; // to which group kth permutation belongs
            ans += (nums[id]+'0');
            nums.erase(nums.begin()+id);
            k -= fact*id;
        }
        return ans;
    }
};
