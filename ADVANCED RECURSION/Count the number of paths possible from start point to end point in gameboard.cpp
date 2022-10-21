#include<iostream>
using namespace std;

int countPath(int s, int e){ //  s= starting point, e= ending point
    if(s==e){ // base case
        return 1;
    }
    if(s>e){ // base case
        return 0;
    }

    int count=0;
    for(int i=1;i<=6;i++){
        count += countPath(s+i,e);
    }
    return count;
}

int main(){
    cout<< countPath(0,3)<<endl;
    return 0;
}