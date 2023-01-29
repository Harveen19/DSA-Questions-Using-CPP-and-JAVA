/* 867. Transpose Matrix
Easy
2.6K
417
Companies
Given a 2D integer array matrix, return the transpose of matrix.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.



 

Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
Example 2:

Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]
*/

class Solution {
public:
    vector<vector<int>> transpose(vector<vector<int>>& A) {
        int row=A.size(),col=A[0].size();
        vector<vector<int>> B(col, vector<int> (row)); 
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int temp= A[i][j];
                A[i][j]= B[j][i];
                B[j][i]=temp;
            }
        }
        return B;
    }
};
