#include<bits/stdc++.h>
using namespace std;

class Stack{
    int N;
    queue<int> q1;
    queue<int> q2;

    public:
    Stack(){
        N=0;
    }

    void pop(){
        if(q1.empty()){
            return;
        }
        // if q1 is not empty until one element dfoesnot left in the queue q1 we'll push all elements in q2 which will be empty
        while(q1.size()!=1){
           q2.push(q1.front());
           q1.pop(); 
        }

        // to pop the one element left
        q1.pop();
        N--;

        queue<int> temp=q1;
        q1=q2;
        q2=temp;
    }

    void push(int val){
        q1.push(val);
        N++;
    }

    int top(){
        if(q1.empty()){
            return -1;
        }
        while(q1.size()!=1){
            q2.push(q1.front());
            q1.pop();
        }
        // as the size has become one so we have return that value
        int ans=q1.front();
        // we have to do push before return bcz we're not only pop but also giving one element 
        q2.push(ans);
        // when we push q1==q2 so now we have to just exchange them
        queue<int> temp=q1;
        q1=q2;
        q2=temp;

        return ans;
    }

    int size(){
        return N;
    }
};

int main(){
    Stack st;
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);

    cout<<st.top()<<endl;
    st.pop();
    cout<<st.top()<<endl;
    st.pop();
    cout<<st.size()<<endl;
    return 0;
}
