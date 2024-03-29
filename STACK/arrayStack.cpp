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

    // empty operation
    bool empty(){
       // we'll be checking if the value of top is -1.
       return top==-1; 
    }
};

int main(){
    stack st; // made a class named st
    st.push(1);
    st.push(2);
    st.push(3);
    cout<<st.Top()<<endl;

    st.pop();
    cout<<st.Top()<<endl;

    st.pop();
    st.pop();
    st.pop();
    cout<<st.empty()<<endl;

    return 0;
}