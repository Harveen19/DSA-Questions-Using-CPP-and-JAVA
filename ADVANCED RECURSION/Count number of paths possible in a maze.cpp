#include<iostream>
using namespace std;

int countPathMaze(int n, int i, int j){
    if(i==n-1 && j==n-1){ // base case
        return 1;
    }
    if(i>=n || j>=n){ // base case
        return 0;
    }
    
    return countPathMaze(n,i+1,j) + countPathMaze(n,j+1,i); // used for all possible paths 
}

int main(){

    cout<< countPathMaze(3,0,0) <<endl;
    return 0;
}