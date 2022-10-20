#include<iostream>
using namespace std;

void towerofHanoi(int n, char src, char dest, char helper){
    if(n==0){ // base case
        return;
    }
    
    // we will call the function and n-1 blocks go from src to helper.
    // here destination will be acting as a helper and in place of n it will be n-1.
    towerofHanoi(n-1, src, helper, dest);
    cout<< "Move from "<< src <<" to "<< dest <<endl;

    towerofHanoi(n-1, helper, dest, src); // Here we are sending blocks from helper to destination and src is acting here as helper. 
}

int main(){
    towerofHanoi(3, 'A', 'C', 'B');
    return 0;
}