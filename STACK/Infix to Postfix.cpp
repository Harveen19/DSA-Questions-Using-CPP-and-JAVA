#include<iostream>
#include<stack>
#include<math.h>
using namespace std;

int prec(char c){ // precedence of current character
    if(c=='^'){
        return 3;
    }
    if(c=='/' || c=='*'){
        return 2;
    }
    if(c=='+' || c=='-'){
        return 1;
    }
    else{
        return -1; // when string is empty and opening bracket comes
    }
}

string infixTopostfix(string s){
    stack<char> st;
    string res;

    for(int i=0;i<s.length();i++){
        if((s[i]>='a' && s[i]<='z') || (s[i]>='A' && s[i]<='Z')){
            res+=s[i];
        }
        else if(s[i]=='('){
            st.push(s[i]);
        }
        else if(s[i]==')'){
            while(!st.empty() && st.top()!='('){
                res+=st.top();
                st.pop();
            }
            if(!st.empty()){
                st.pop();
            }
        }
        else{ // if operator
            while(!st.empty() && prec(st.top()) > prec(s[i])){
                res+=st.top();
                st.pop();
            }
            st.push(s[i]);
        }
    }
    while(!st.empty()){
        res+=st.top();
        st.pop();
    }
    return res;
}

int main(){
    cout<<infixTopostfix("(a-b/c)*(a/k-l)")<<"\n";
    return 0;
}
