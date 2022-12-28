//59. Spiral Matrix II
//Medium
//4.5K
//201
//Companies
//Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.


//Example 1:

//Input: n = 3
//Output: [[1,2,3],[8,9,4],[7,6,5]]
//Example 2:

//Input: n = 1
//Output: [[1]]


class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
        
        vector<vector<int>> result(n, vector<int>(n, 0));
        int row_start=0, row_end=n-1;
        int col_start=0, col_end=n-1;
        
        int k=1;
        while (row_start <= row_end && col_start <= col_end) {
            
            // for row start
            for (int j=col_start; j<=col_end; j++) {
                result[row_start][j] = k++;
            }
            row_start++;

            // for col end
            for (int i=row_start; i<=row_end; i++) {
                result[i][col_end] = k++;
            }
            col_end--;

            // for row end
            for (int j=col_end; j>=col_start; j--) {
                result[row_end][j] = k++;
            }
            row_end--;

            // for col start
            for (int i=row_end; i>=row_start; i--) {
                result[i][col_start] = k++;
            }
            col_start++;
        }
        return result;
    }
};