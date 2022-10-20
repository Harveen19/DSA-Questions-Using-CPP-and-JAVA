#include<iostream>
using namespace std;

void Replace(string s){
    // base case
    if(s.length()==0){
        return;
    }

    // Recursive case
    if(s[0]=='p' && s[1]=='i'){
        cout<< "3.14";
        Replace(s.substr(2)); // Here afte pi all the characters will go to the function.
    }
    else{
        cout<<s[0];
        Replace(s.substr(1)); // Here after one character rest of the string will go the function.
    }
}

int main(){
    Replace("pipppiiipi");
    return 0;
}