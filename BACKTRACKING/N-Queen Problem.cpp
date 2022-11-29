#include<iostream>
using namespace std;

bool isSafe(int** arr, int x, int y, int n){
    for(int row=0; row<x; row++){
        if(arr[row][y]==1){
            return false;
        }
			}

    int row=x, col=y;
    while(row>=0 && col>=0){ // for left diagonal
        if(arr[row][col]==1){
            return false;
		}
        row--;
        col--;
		}

     row=x, col=y;
    while(row>=0 && col<n){ // for right diagonal
        if(arr[row][col]==1){
            return false;
		}
        row--;
        col++;
	}
	return true;

}

// Recursive call and Backtracking
bool nQueen(int** arr, int x, int n){
    if(x>=n){ // base case
        return true;
			}

    // To check if the place is safe to keep the queen
    for (int col = 0; col < n; col++){
        /* code */
        if(isSafe(arr,x,col,n)){
            arr[x][col]=1;

            if(nQueen(arr,x+1,n)){
                return true;
	    	}
	    	
            arr[x][col]=0; // this step is backtracking
		}
    }
    
    return false; // if we are not able to place our queen in any column
}

int main(){
    int n;
    cin>>n;

    int** arr= new int*[n];
    for(int i=0; i<n; i++){
        arr[i] = new int[n];
        for(int j=0; j<n; j++){ // for initialization
            arr[i][j]=0;
        }
    }

    if (nQueen(arr,0,n)){ // to check if it gives true
        for(int i=0; i<n; i++){  // for array print
            for(int j=0; j<n; j++){
                cout<< arr[i][j] << " ";
            }
            cout<<endl;
        }
    }
    return 0;   
}