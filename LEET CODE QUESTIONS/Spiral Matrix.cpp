//54. Spiral Matrix
//Medium
//9.9K
//972
//Companies
//Given an m x n matrix, return all elements of the matrix in spiral order.


//Example 1:


//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [1,2,3,6,9,8,7,4,5]
//Example 2:

//Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//Output: [1,2,3,4,8,12,11,10,9,5,6,7]

class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) 
    {
       int m=matrix.size();
         vector<int>res;
          if(m==0)
          return res;
        int n=matrix[0].size();
        
        int rowstart=0;
        int rowend=m;
        int colstart=0;
        int colend=n;
        
        int row, col;
        while(rowstart<rowend && colstart<colend)
        {
          
            for(col=colstart;col<colend;col++)
            res.push_back(matrix[rowstart][col]);
            rowstart++;
            
            for(row=rowstart;row<rowend;row++)
            res.push_back(matrix[row][colend-1]);
            colend--;
            
            if(rowstart<rowend)
            {
                for(col=colend-1;col>=colstart;col--)
                res.push_back(matrix[rowend-1][col]);
                rowend--;
            }
            
            if(colstart<colend)
            {
                for(row=rowend-1;row>=rowstart;row--)
                res.push_back(matrix[row][colstart]);
                colstart++;
            }
            
        }
        return res;       
    }
};