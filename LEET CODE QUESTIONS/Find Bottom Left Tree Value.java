// 513. Find Bottom Left Tree Value
// Solved
// Medium
// Topics
// Companies
// Given the root of a binary tree, return the leftmost value in the last row of the tree.

 

// Example 1:


// Input: root = [2,1,3]
// Output: 1
// Example 2:


// Input: root = [1,2,3,4,null,5,6,null,null,7]
// Output: 7

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * } 
 */
class Solution {
    int maxDepth;
    int bottomValue;

    public void dfs(TreeNode root, int depth){
        if(root == null){
            return;
        }

        if(depth > maxDepth){
            maxDepth = depth;
            bottomValue = root.val;
        }

        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }

    public int findBottomLeftValue(TreeNode root) {
        maxDepth = -1;
        bottomValue = 0;
        dfs(root, 0);
        return bottomValue;
    }
}
