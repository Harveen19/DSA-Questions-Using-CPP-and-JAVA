//51. N-Queens
//Hard
//9K
//200
//Companies
//The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

//Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.

//Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.


//Example 1:

//Input: n = 4
//Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
//Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above
//Example 2:

//Input: n = 1
//Output: [["Q"]]

class Solution {
public:
    vector<vector<string>> solveNQueens(int n) {
        vector<vector<string>> result; // each string will be n
        string s(n, '.');
        vector<string> board(n, s);
        helper(result, board, 0, n);
        
        return result;
    }
    
    void helper(vector<vector<string>>& result, vector<string> board, int row, int n)
    {
        if(row==n) 
        {
            result.push_back(board);
            return;
        }
        
        
        for(int c=0; c<n; c++)
        {
        
            if(isValid(board, row, c, n)) 
            {   
                board[row][c]='Q';
                helper(result, board, row+1, n);
                board[row][c]='.';
            }
        }
    }
    
    bool isValid(vector<string>& board,int row,int col, int n)
    {
        for(int i=0; i<n; i++) // check all columns
        {
            if(i!=col && board[row][i]=='Q') return false;
        }
        
        for(int i=0; i<n; i++) // check all rows
        {
            if(i!=row && board[i][col]=='Q') return false;
        }
        
        for(int i=row+1, j=col+1; i<n && j<n; i++, j++) //diagonal down
        {
            if(board[i][j]=='Q') return false;
        }
        
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--)// diagonal up
        {
            if(board[i][j]=='Q') return false;
        }
        
        for(int i=row+1, j=col-1; i<n && j>=0; i++, j--) // anti diagonal down
        {
            if(board[i][j]=='Q') return false;
        }
        
        for(int i=row-1, j=col+1; i>=0 && j<n; i--, j++)// anti diagonal up
        {
            if(board[i][j]=='Q') return false;
        }
        
        return true;
    }
    
    
};