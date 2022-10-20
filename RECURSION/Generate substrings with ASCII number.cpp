#include<iostream>
using namespace std;

void subseq(string s, string ans){
    if(s.length()==0){ // base case
        cout<<ans<<endl;
        return;
    }

    char ch= s[0]; // Take out the character
    int code= ch; // With this we'll get ASCII code of character
    string restofS= s.substr(1);

    subseq(restofS, ans);
    subseq(restofS, ans+ch);
    subseq(restofS, ans+ to_string(code));
    // AS code is in int so converting it to string we'll use STL function to_string
}

int main(){
    subseq("ABC", "");
    return 0;
}