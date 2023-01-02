#include<iostream>
#include<stack>
using namespace std;

void reverse(string s){
    // start traversing from 0th index and where we'll get space it means our word has completed
    // Then we'll push all the words ofter that pop them one by one
    stack<string> st;
    for(int i=0;i<s.length();i++){
        string word="";
        while(s[i]!=' ' && i<s.length()){
            word+=s[i];
            i++;
        }
        st.push(word);
    }
    while(!st.empty()){
        cout<<st.top()<<" ";
        st.pop();
    }
    cout<<endl;
}

int main(){
    string s="Hey, how are you doing?";
    reverse(s);
}