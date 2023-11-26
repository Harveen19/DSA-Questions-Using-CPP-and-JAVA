// 1727. Largest Submatrix With Rearrangements
// Solved
// Medium
// Topics
// Companies
// Hint
// You are given a binary matrix matrix of size m x n, and you are allowed to rearrange the columns of the matrix in any order.

// Return the area of the largest submatrix within matrix where every element of the submatrix is 1 after reordering the columns optimally.

 

// Example 1:


// Input: matrix = [[0,0,1],[1,1,1],[1,0,1]]
// Output: 4
// Explanation: You can rearrange the columns as shown above.
// The largest submatrix of 1s, in bold, has an area of 4.
// Example 2:


// Input: matrix = [[1,0,1,0,1]]
// Output: 3
// Explanation: You can rearrange the columns as shown above.
// The largest submatrix of 1s, in bold, has an area of 3.
// Example 3:

// Input: matrix = [[1,1,0],[1,0,1]]
// Output: 2
// Explanation: Notice that you must rearrange entire columns, and there is no way to make a submatrix of 1s larger than an area of 2.
 

// Constraints:

// m == matrix.length
// n == matrix[i].length
// 1 <= m * n <= 10^5
// matrix[i][j] is either 0 or 1.

class Solution {
    public int largestSubmatrix(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return 0;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;

        // to store height of each column
        int[][] height = new int[m][n];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 1){
                    height[i][j] = i == 0 ? 1 : height[i - 1][j] + 1;
                }
            }
        }

        int maxArea = 0;
        for(int i=0; i<m; i++){
            Arrays.sort(height[i]);

            for(int j=0; j<n; j++){
                maxArea = Math.max(maxArea, height[i][j] * (n-j));
            }
        }

        return maxArea;
    }
}
