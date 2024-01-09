import java.util.*;

public class Main
{
    public static void matrixDiagonally(int[][] matrix){
        int row, col;
        int rowCount = matrix.length;
        int columnCount = matrix[0].length;
        
        for(int i=0;i<rowCount;i++){
            for(row = i, col = 0; row >= 0 && col < columnCount; row--, col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        
        for(int i=1;i<columnCount;i++){
            for(row = rowCount - 1, col = i; row >= 0 && col < columnCount; row--, col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int col = s.nextInt();
		int matrix[][] = new int[row][col];
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		        matrix[i][j] = s.nextInt();
		    }
		}
		
		System.out.println("Diagonally");
		matrixDiagonally(matrix);
	}
}
