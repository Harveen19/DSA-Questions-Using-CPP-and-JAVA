#include<iostream>
using namespace std;

bool isSafe(int** arr, int x, int y, int n){

    if(x<n && y<n && arr[x][y]==1){ // This is to check whether rat can go to that block or not
        return true;
    }
    return false;
}

// main function
bool ratInMaze(int** arr, int x, int y, int n, int** solArr){ // x and y used for tracking the position

    if((x== (n-1)) && (y== (n-1))){ // base condition if rat has reached its path
        solArr[x][y]=1;
        return true;
    }

    if(isSafe(arr,x,y,n)){ // To check whether rat can go to x and y or not
        solArr[x][y]=1; // solArr for the output

        // Recursive call
        if(ratInMaze(arr,x+1,y,n,solArr)){ // moving in right direction
          return true;
        }
        if (ratInMaze(arr,x,y+1,n,solArr)) // moving in downward direction
        {
            return true;
        }
        solArr[x][y]=0; // Here we are doing backtracking
        return false;
    }
    return false;
}

int main(){
    int n;
    cin>>n;

    int** arr=new int*[n]; // through dynamic allocation
    for(int i=0;i<n;i++){
        arr[i]= new int[n]; // with this memory is allocated to 2d Array
    }

    for(int i=0;i<n;i++){ // for array input
        for(int j=0;j<n;j++){
            cin>>arr[i][j]; 
        }
    }

    int** solArr= new int*[n];
    for(int i=0;i<n;i++){
        solArr[i]= new int[n];
        for(int j=0;j<n;j++){
            solArr[i][j]=0;
        }
    }

    if(ratInMaze(arr,0,0,n,solArr)){
        for(int i=0;i<n;i++){ 
            for(int j=0;j<n;j++){
                cout<<solArr[i][j] <<" "; 
           }
           cout<<endl;
       }
    }
    return 0;
}