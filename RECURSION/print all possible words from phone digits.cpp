#include<iostream>
using namespace std;

string keypadArr[]={"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

void keypad(string s, string ans){
    if(s.length()==0){ // base case
        cout<<ans<<endl;
        return;
    }

    // Recursive case
    char ch= s[0];
    string code= keypadArr[ch-'0']; // for converting character to integer and ASCII code of 0 will be minus from ASCII code of ch.
    string restofS= s.substr(1);

    for(int i=0;i<code.length();i++){ // for traversing around the code we'll get
        keypad(restofS, ans+code[i]);
    }
}

int main(){
    keypad("23","");
    return 0;
}