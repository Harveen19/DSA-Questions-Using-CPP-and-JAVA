// Solve the Sudoku
// Hard Accuracy: 37.98% Submissions: 77K+ Points: 8
// Given an incomplete Sudoku configuration in terms of a 9 x 9  2-D square matrix (grid[][]), the task is to find a solved Sudoku. For simplicity, you may assume that there will be only one unique solution.

// A sudoku solution must satisfy all of the following rules:

// Each of the digits 1-9 must occur exactly once in each row.
// Each of the digits 1-9 must occur exactly once in each column.
// Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
// Zeros in the grid indicates blanks, which are to be filled with some number between 1-9. You can not replace the element in the cell which is not blank.


// Sample Sudoku for you to get the logic for its solution:



// Example 1:

// Input:
// grid[][] = 
// [[3 0 6 5 0 8 4 0 0],
// [5 2 0 0 0 0 0 0 0],
// [0 8 7 0 0 0 0 3 1 ],
// [0 0 3 0 1 0 0 8 0],
// [9 0 0 8 6 3 0 0 5],
// [0 5 0 0 9 0 6 0 0],
// [1 3 0 0 0 0 2 5 0],
// [0 0 0 0 0 0 0 7 4],
// [0 0 5 2 0 6 3 0 0]]
// Output:
// True
// 3 1 6 5 7 8 4 9 2
// 5 2 9 1 3 4 7 6 8
// 4 8 7 6 2 9 5 3 1
// 2 6 3 4 1 5 9 8 7
// 9 7 4 8 6 3 1 2 5
// 8 5 1 7 9 2 6 4 3
// 1 3 8 9 4 7 2 5 6
// 6 9 2 3 5 1 8 7 4
// 7 4 5 2 8 6 3 1 9
// Explanation: 
// There exists a valid Sudoku for the input grid, which is shown in output.
// Example 2:

// Input:
// grid[][] = 
// [[3 6 6 5 0 8 4 0 0],
// [5 2 0 0 0 0 0 0 0],
// [0 8 7 0 0 0 0 3 1 ],
// [0 0 3 0 1 0 0 8 0],
// [9 0 0 8 6 3 0 0 5],
// [0 5 0 0 9 0 6 0 0],
// [1 3 0 0 0 0 2 5 0],
// [0 0 0 0 0 0 0 7 4],
// [0 0 5 2 0 6 3 0 0]]
// Output:
// False
// Explanation: 
// There does not exists a valid Sudoku for the input grid, since there are two 6s in the first row. Which cannot replaced.
// Your Task:
// You need to complete the two functions:

// SolveSudoku(): Takes a grid as its argument and returns true if a solution is possible and false if it is not, on returning false driver will print "No solution exists".

// printGrid(): Takes a grid as its argument and prints the 81 numbers of the solved Sudoku in a single line with space separation. Do not give a new line character after printing the grid.

// Expected Time Complexity: O(9N*N).
// Expected Auxiliary Space: O(N*N).

// Constraints:
// 0 ≤ grid[i][j] ≤ 9


class Solution
{
    //Function to find a solved Sudoku.
    public static boolean isSafe(int grid[][], int row, int col, int digit){
        // row and column
        for(int i=0; i<grid.length; i++){
            if(grid[i][col] == digit){
                return false;
            }
            
            if(grid[row][i] == digit){
                return false;
            }
        }
        
        // 3*3 grid
        int str = (row/3) * 3; // starting row
        int stc = (col/3) * 3; // starting column
        
        for(int i=str; i<str+3; i++){
            for(int j=stc; j<stc+3; j++){
                if(grid[i][j] == digit){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public static boolean solver(int grid[][], int row, int col){
        if(row == grid.length){ // Base case
            return true;
        }
        
        int newRow = row, newCol = col + 1;
        if(col + 1 == grid.length){
            newRow = row + 1;
            newCol = 0;
        }
        
        // Checking if number already exists
        if(grid[row][col] != 0){
            return solver(grid, newRow, newCol);
        }
        
        for(int i=1; i<=9; i++){
            if(isSafe(grid, row, col, i)){
                grid[row][col] = i;
                if(solver(grid, newRow, newCol)){
                    return true;
                } else {
                    grid[row][col] = 0;
                }
            }
        }
        
        return false;
    }
    
    public static boolean SolveSudoku(int grid[][])
    {
        // add your code here
        return solver(grid, 0, 0);
    }
    
    //Function to print grids of the Sudoku.
    public static void printGrid (int grid[][])
    {
        // add your code here
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(grid[i][j] + " ");
            }
        }
    }
}