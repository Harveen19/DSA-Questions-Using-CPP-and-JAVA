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

    // pop operation
    // In which we'll be removing topmost element
    void pop(){
        if(top== -1){
            cout<<"No element to pop"<<endl;
            return;
        }
        top--;
    }

    // top function
    int Top(){
        if(top== -1){
            cout<<"No element in stack"<<endl;
            return -1;
        }
        return arr[top];
    }

    
};

int main(){

}