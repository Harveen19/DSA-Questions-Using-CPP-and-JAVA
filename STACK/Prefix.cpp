#include<iostream>
#include<stack>
#include<math.h>
using namespace std;

int prefix(string s){
    stack<int> st;
    // traversing from last
    for(int i=s.length()-1;i>=0;i--){
        if(s[i]>='0' && s[i]<='9'){ // means it is a operand
            st.push(s[i]-'0');
        }
        else{ // if it is a operator we're taking out 2 operands from stack
            int op1=st.top();
            st.pop();
            int op2=st.top();
            st.pop();

            switch(s[i]){
                case '+':
                st.push(op1+op2);
                break;

                case '/':
                st.push(op1/op2);
                break;

                case '*':
                st.push(op1*op2);
                break;

                case '-':
                st.push(op1-op2);
                break;

                case '^':
                st.push(pow(op1,op2));
                break;
            }
        }
    }
    return st.top();
}

int main(){
    cout<<prefix("-+7*45+20")<<"\n";
    return 0;
}
