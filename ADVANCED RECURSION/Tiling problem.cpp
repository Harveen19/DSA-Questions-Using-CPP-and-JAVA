#include<iostream>
using namespace std;

int tilingWays(int n){
    if(n==0){ // base case
        return 0;
    }
    if(n==1){ // base case
        return 1;
    }

    return tilingWays(n-1) + tilingWays(n-2); // n-1 for vertically tiles placed and n-2 for horizontally tiles placed

}

int main(){

    cout<< tilingWays(4) <<endl;
    return 0;
}