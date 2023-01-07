/* 36. Valid Sudoku
Medium
7.7K
859
Companies
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.
 

Example 1:


Input: board = 
[["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: true
Example 2:

Input: board = 
[["8","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: false
Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
*/


class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        // created 3 different hashsets for rows, cols and sub-grids

        unordered_set<char> col[9];
        unordered_set<char> row[9];
        unordered_set<char> sub_grid[3][3];

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char found=board[i][j];

                // if the position is not blank , we have to check
                if(found != '.'){
                    if(row[i].count(found) || col[j].count(found) || sub_grid[i/3][j/3].count(found))
                    return false;
                }

                row[i].insert(found);
                col[j].insert(found);
                sub_grid[i/3][j/3].insert(found);
            }
        }
        return true;
    }
};
