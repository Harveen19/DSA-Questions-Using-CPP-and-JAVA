// Inorder Traversal and BST
// EasyAccuracy: 44.45%Submissions: 35K+Points: 2
// Money can’t buy you happiness. But Geekbits can buy you GfG goodies and it’s the same thing. Earn 2X Geekbits Now

// banner
// Given an array arr of size N, determine whether this array represents an inorder traversal of a BST. 

// Note: All keys in BST must be unique.

// Example 1:

// Input:
// N = 3
// arr = {2, 4, 5}
// Output: 1
// Explaination: 
// Given array is inorder traversal for the following tree:
//     4
//    / \
//   2   5
// Example 2:

// Input:
// N = 3
// arr = {2, 4, 1}
// Output: 0
// Explaination: 
// Given array can not represent any BST.
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function isRepresentingBST() which takes the array arr[] and its size N as input parameters and returns 1 if array represents Inorder traversal of a BST, else returns 0.

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)

// Constraints:
// 1 ≤ N ≤ 10^5
// 1 ≤ arr[i] ≤ 10^5


class Solution
{
    static int isRepresentingBST(int arr[], int N)
    {
        // code here
        if(N == 0 || N == 1){
            return 1;
        }
        
        for(int i=1;i<arr.length;i++){
            if(arr[i-1] > arr[i]){
                return 0;
            }
        }
        
        return 1;

    }
}
