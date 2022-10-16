#include <iostream>
using namespace std;

int getBit(int n, int post){
    return (n >> post) & 1;
}

int setBit(int n, int post){
    return (n | (1 << post));
}

int clearBit(int n, int post){
    int mask = ~(1 << post);
    return (n & mask);
}

int updateBit(int n, int post, int value){
    int mask = ~(1 << post);
    n = n & mask;
    return ( n | ( value << post));
}

int main(){
    
    //cout<<getBit(5,2);
    //cout<<setBit(5,1);
    //cout<<clearBit(5,2);
    cout<<updateBit(5,1,1);
    return 0;
}
