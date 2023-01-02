#include<iostream>
using namespace std;

#define n 100

class stack{
    int* arr;
    int top;

    public:
    stack(){ // creating a constructor and allocating memory to array
        arr = new int[n];
        top = -1;
    }
    // push operation
    void push(int x){
        if(top==n-1){ // if it is on last index
        cout<<"Stack overflow"<<endl;
        return;
        }
        // if this condition doesnot comes true we'll increment top
        // And insert the value of x in top
        top++;
        arr[top]=x;
    }
};

int main(){

}